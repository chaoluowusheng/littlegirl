package	com.cango;
public class IZdzInsureTypeInfo {
	private String insureNo;
	private short insureType;
	private double insureAmount;
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
	public void setInsureType(short insureType){
		this.insureType = insureType;
	}
	public short getInsureType(){
		return insureType;
	}
	public void setInsureAmount(double insureAmount){
		this.insureAmount = insureAmount;
	}
	public double getInsureAmount(){
		return insureAmount;
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
