package	com.cango;
public class IZdzCustomCommisionPolicy {
	private int dealerId;
	private String insureCompanyId;
	private Date startDate;
	private Date endDate;
	private double commision;
	private Date createDateTime;
	private int createUser;
	private Date lastUpdateTime;
	private int updateUser;
	public void setDealerId(int dealerId){
		this.dealerId = dealerId;
	}
	public int getDealerId(){
		return dealerId;
	}
	public void setInsureCompanyId(String insureCompanyId){
		this.insureCompanyId = insureCompanyId;
	}
	public String getInsureCompanyId(){
		return insureCompanyId;
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
