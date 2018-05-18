package	com.cango;
public class IZdzTrafficCommisionPolicy {
	private int cityId;
	private String insureCompanyId;
	private int policyType;
	private Date startDate;
	private Date endDate;
	private double commision;
	private Date createDateTime;
	private int createUser;
	private Date lastUpdateTime;
	private int updateUser;
	public void setCityId(int cityId){
		this.cityId = cityId;
	}
	public int getCityId(){
		return cityId;
	}
	public void setInsureCompanyId(String insureCompanyId){
		this.insureCompanyId = insureCompanyId;
	}
	public String getInsureCompanyId(){
		return insureCompanyId;
	}
	public void setPolicyType(int policyType){
		this.policyType = policyType;
	}
	public int getPolicyType(){
		return policyType;
	}
	public void setStartDate(Date startDate){
		this.startDate = startDate;
	}
	public Date getStartDate(){
		return startDate;
	}
	public void setEndDate(Date endDate){
		this.endDate = endDate;
	}
	public Date getEndDate(){
		return endDate;
	}
	public void setCommision(double commision){
		this.commision = commision;
	}
	public double getCommision(){
		return commision;
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
