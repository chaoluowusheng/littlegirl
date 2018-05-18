package	com.cango;
public class IAewContractCancelApply {
	private int contractcancelid;
	private String contractno;
	private short cancelstatus;
	private short applyuser;
	private Date applydate;
	private String applycomment;
	private short approveuser;
	private Date approvedate;
	private String refusecomment;
	private Date createdatetime;
	private short createuser;
	private Date lastupdatetime;
	private short updateuser;
	public void setContractcancelid(int contractcancelid){
		this.contractcancelid = contractcancelid;
	}
	public int getContractcancelid(){
		return contractcancelid;
	}
	public void setContractno(String contractno){
		this.contractno = contractno;
	}
	public String getContractno(){
		return contractno;
	}
	public void setCancelstatus(short cancelstatus){
		this.cancelstatus = cancelstatus;
	}
	public short getCancelstatus(){
		return cancelstatus;
	}
	public void setApplyuser(short applyuser){
		this.applyuser = applyuser;
	}
	public short getApplyuser(){
		return applyuser;
	}
	public void setApplydate(Date applydate){
		this.applydate = applydate;
	}
	public Date getApplydate(){
		return applydate;
	}
	public void setApplycomment(String applycomment){
		this.applycomment = applycomment;
	}
	public String getApplycomment(){
		return applycomment;
	}
	public void setApproveuser(short approveuser){
		this.approveuser = approveuser;
	}
	public short getApproveuser(){
		return approveuser;
	}
	public void setApprovedate(Date approvedate){
		this.approvedate = approvedate;
	}
	public Date getApprovedate(){
		return approvedate;
	}
	public void setRefusecomment(String refusecomment){
		this.refusecomment = refusecomment;
	}
	public String getRefusecomment(){
		return refusecomment;
	}
	public void setCreatedatetime(Date createdatetime){
		this.createdatetime = createdatetime;
	}
	public Date getCreatedatetime(){
		return createdatetime;
	}
	public void setCreateuser(short createuser){
		this.createuser = createuser;
	}
	public short getCreateuser(){
		return createuser;
	}
	public void setLastupdatetime(Date lastupdatetime){
		this.lastupdatetime = lastupdatetime;
	}
	public Date getLastupdatetime(){
		return lastupdatetime;
	}
	public void setUpdateuser(short updateuser){
		this.updateuser = updateuser;
	}
	public short getUpdateuser(){
		return updateuser;
	}
}
