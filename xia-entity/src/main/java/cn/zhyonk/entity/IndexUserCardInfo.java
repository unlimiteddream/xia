package cn.zhyonk.entity;

import java.io.Serializable;
import java.util.ArrayList;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;

public class IndexUserCardInfo extends Model<IndexUserCardInfo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableField("open_id")
	private String openId;
	
	@TableField("user_phone")
	private String userPhone;
	
	@TableField("user_name")
	private String userName;
	
	@TableField("headImgUrl")
	private String headImgUrl;
	
	@TableField("tag_list")
	private String tagList;
	
	@TableField("praise_average")
	private String praiseAverage;
	
	@TableField("position_name")
	private String positionName;
	
	@TableField("product_price")
	private String productPrice;
	
	@TableField("sales")
	private String sales;
	
	@TableField("record")
	private String record;
	
	@TableField("workRecordCount")
	private String workRecordCount;
	
	public String getWorkRecordCount() {
		return workRecordCount;
	}

	public void setWorkRecordCount(String workRecordCount) {
		this.workRecordCount = workRecordCount;
	}

	private ArrayList<UserTag> tagNameList;

	public String getPositionName() {
		return positionName;
	}

	public ArrayList<UserTag> getTagNameList() {
		return tagNameList;
	}


	public void setTagNameList(ArrayList<UserTag> tagNameList) {
		this.tagNameList = tagNameList;
	}


	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public String getTagList() {
		return tagList;
	}

	public void setTagList(String tagList) {
		this.tagList = tagList;
	}

	public String getPraiseAverage() {
		return praiseAverage;
	}

	public void setPraiseAverage(String praiseAverage) {
		this.praiseAverage = praiseAverage;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	@Override
	protected Serializable pkVal() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
