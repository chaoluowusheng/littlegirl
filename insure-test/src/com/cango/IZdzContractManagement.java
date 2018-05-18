package	com.cango;
public class IZdzContractManagement {
	private int cityId;
	private String insureCompanyId;
	private byte onBusiness;
	private Date createdatetime;
	private int createuser;
	private Date lastupdatetime;
	private int updateuser;
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
	public void setOnBusiness(byte onBusiness){
		this.onBusiness = onBusiness;
	}
	public byte getOnBusiness(){
		return onBusiness;
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
