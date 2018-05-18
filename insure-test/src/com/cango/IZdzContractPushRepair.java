package	com.cango;
public class IZdzContractPushRepair {
	private int dealerId;
	private String insureCompanyId;
	private String carDealerCd;
	private String pushRepairCd;
	private Date createdatetime;
	private int createuser;
	private Date lastupdatetime;
	private int updateuser;
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
	public void setCarDealerCd(String carDealerCd){
		this.carDealerCd = carDealerCd;
	}
	public String getCarDealerCd(){
		return carDealerCd;
	}
	public void setPushRepairCd(String pushRepairCd){
		this.pushRepairCd = pushRepairCd;
	}
	public String getPushRepairCd(){
		return pushRepairCd;
	}
	public void setCreatedatetime(Date createdatetime){
		this.createdatetime = createdatetime;
	}
	public Date getCreatedatetime(){
		return createdatetime;
	}
	public void setCreateuser(int createuser){
		this.createuser = createuser;
	}
	public int getCreateuser(){
		return createuser;
	}
	public void setLastupdatetime(Date lastupdatetime){
		this.lastupdatetime = lastupdatetime;
	}
	public Date getLastupdatetime(){
		return lastupdatetime;
	}
	public void setUpdateuser(int updateuser){
		this.updateuser = updateuser;
	}
	public int getUpdateuser(){
		return updateuser;
	}
}
