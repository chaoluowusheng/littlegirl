package	com.cango;
public class MInsure {
	private String insureCompanyId;
	private String insureCompanyName;
	private String insureCompanyNickName;
	private byte valid;
	private byte orderNo;
	private Date createDateTime;
	private short createUser;
	private Date lastUpdateTime;
	private short updateUser;
	public void setInsureCompanyId(String insureCompanyId){
		this.insureCompanyId = insureCompanyId;
	}
	public String getInsureCompanyId(){
		return insureCompanyId;
	}
	public void setInsureCompanyName(String insureCompanyName){
		this.insureCompanyName = insureCompanyName;
	}
	public String getInsureCompanyName(){
		return insureCompanyName;
	}
	public void setInsureCompanyNickName(String insureCompanyNickName){
		this.insureCompanyNickName = insureCompanyNickName;
	}
	public String getInsureCompanyNickName(){
		return insureCompanyNickName;
	}
	public void setValid(byte valid){
		this.valid = valid;
	}
	public byte getValid(){
		return valid;
	}
	public void setOrderNo(byte orderNo){
		this.orderNo = orderNo;
	}
	public byte getOrderNo(){
		return orderNo;
	}
	public void setCreateDateTime(Date createDateTime){
		this.createDateTime = createDateTime;
	}
	public Date getCreateDateTime(){
		return createDateTime;
	}
	public void setCreateUser(short createUser){
		this.createUser = createUser;
	}
	public short getCreateUser(){
		return createUser;
	}
	public void setLastUpdateTime(Date lastUpdateTime){
		this.lastUpdateTime = lastUpdateTime;
	}
	public Date getLastUpdateTime(){
		return lastUpdateTime;
	}
	public void setUpdateUser(short updateUser){
		this.updateUser = updateUser;
	}
	public short getUpdateUser(){
		return updateUser;
	}
}
