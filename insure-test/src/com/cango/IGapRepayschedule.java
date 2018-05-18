package	com.cango;
public class IGapRepayschedule {
	private int scheduleid;
	private String contractno;
	private String applycd;
	private byte seqno;
	private double amount;
	private Date repaydate;
	private Date realpaiddate;
	private int fileid;
	private byte resultflg;
	private String comment;
	private Date updatedate;
	private Date lastupdatetime;
	private int updateuser;
	private Date createdatetime;
	private int createuser;
	public void setScheduleid(int scheduleid){
		this.scheduleid = scheduleid;
	}
	public int getScheduleid(){
		return scheduleid;
	}
	public void setContractno(String contractno){
		this.contractno = contractno;
	}
	public String getContractno(){
		return contractno;
	}
	public void setApplycd(String applycd){
		this.applycd = applycd;
	}
	public String getApplycd(){
		return applycd;
	}
	public void setSeqno(byte seqno){
		this.seqno = seqno;
	}
	public byte getSeqno(){
		return seqno;
	}
	public void setAmount(double amount){
		this.amount = amount;
	}
	public double getAmount(){
		return amount;
	}
	public void setRepaydate(Date repaydate){
		this.repaydate = repaydate;
	}
	public Date getRepaydate(){
		return repaydate;
	}
	public void setRealpaiddate(Date realpaiddate){
		this.realpaiddate = realpaiddate;
	}
	public Date getRealpaiddate(){
		return realpaiddate;
	}
	public void setFileid(int fileid){
		this.fileid = fileid;
	}
	public int getFileid(){
		return fileid;
	}
	public void setResultflg(byte resultflg){
		this.resultflg = resultflg;
	}
	public byte getResultflg(){
		return resultflg;
	}
	public void setComment(String comment){
		this.comment = comment;
	}
	public String getComment(){
		return comment;
	}
	public void setUpdatedate(Date updatedate){
		this.updatedate = updatedate;
	}
	public Date getUpdatedate(){
		return updatedate;
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
}
