package	com.cango;
public class IZdzContractInsure {
	private String dealerId;
	private String insureCompanyId;
	private Date createdatetime;
	private int createuser;
	private Date lastupdatetime;
	private int updateuser;
	public void setDealerId(String dealerId){
		this.dealerId = dealerId;
	}
	public String getDealerId(){
		return dealerId;
	}
	public void setInsureCompanyId(String insureCompanyId){
		this.insureCompanyId = insureCompanyId;
	}
	public String getInsureCompanyId(){
		return insureCompanyId;
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
