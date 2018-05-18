package	com.cango;
public class IZdzInsurePayInfo {
	private String insureNo;
	private String payUrl;
	private short payStatus;
	private Date payExpiryDate;
	private Date payDate;
	private Date createDateTime;
	private int createUser;
	private Date lastUpdateTime;
	private int updateUser;
	public void setInsureNo(String insureNo){
		this.insureNo = insureNo;
	}
	public String getInsureNo(){
		return insureNo;
	}
	public void setPayUrl(String payUrl){
		this.payUrl = payUrl;
	}
	public String getPayUrl(){
		return payUrl;
	}
	public void setPayStatus(short payStatus){
		this.payStatus = payStatus;
	}
	public short getPayStatus(){
		return payStatus;
	}
	public void setPayExpiryDate(Date payExpiryDate){
		this.payExpiryDate = payExpiryDate;
	}
	public Date getPayExpiryDate(){
		return payExpiryDate;
	}
	public void setPayDate(Date payDate){
		this.payDate = payDate;
	}
	public Date getPayDate(){
		return payDate;
	}
	public void setCreateDateTime(Date createDateTime){
		this.createDateTime = createDateTime;
	}
	public Date getCreateDateTime(){
		return createDateTime;
	}
	public void setCreateUser(int createUser){
		this.createUser = createUser;
	}
	public int getCreateUser(){
		return createUser;
	}
	public void setLastUpdateTime(Date lastUpdateTime){
		this.lastUpdateTime = lastUpdateTime;
	}
	public Date getLastUpdateTime(){
		return lastUpdateTime;
	}
	public void setUpdateUser(int updateUser){
		this.updateUser = updateUser;
	}
	public int getUpdateUser(){
		return updateUser;
	}
}
