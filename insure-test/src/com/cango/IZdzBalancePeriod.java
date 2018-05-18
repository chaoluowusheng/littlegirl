package	com.cango;
public class IZdzBalancePeriod {
	private String dealerId;
	private String balancePeriodStartDate;
	private String balancePeriodEndDate;
	private byte balancePeriod;
	private Date createDateTime;
	private int createUser;
	private Date lastUpdateTime;
	private int updateUser;
	public void setDealerId(String dealerId){
		this.dealerId = dealerId;
	}
	public String getDealerId(){
		return dealerId;
	}
	public void setBalancePeriodStartDate(String balancePeriodStartDate){
		this.balancePeriodStartDate = balancePeriodStartDate;
	}
	public String getBalancePeriodStartDate(){
		return balancePeriodStartDate;
	}
	public void setBalancePeriodEndDate(String balancePeriodEndDate){
		this.balancePeriodEndDate = balancePeriodEndDate;
	}
	public String getBalancePeriodEndDate(){
		return balancePeriodEndDate;
	}
	public void setBalancePeriod(byte balancePeriod){
		this.balancePeriod = balancePeriod;
	}
	public byte getBalancePeriod(){
		return balancePeriod;
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
