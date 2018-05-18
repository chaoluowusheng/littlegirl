package	com.cango;
public class IImagfiledManage {
	private int fileid;
	private String title;
	private byte type;
	private String downloadpath;
	private String applycd;
	private int imagfileid;
	private Date createdatetime;
	private short createuser;
	public void setFileid(int fileid){
		this.fileid = fileid;
	}
	public int getFileid(){
		return fileid;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setType(byte type){
		this.type = type;
	}
	public byte getType(){
		return type;
	}
	public void setDownloadpath(String downloadpath){
		this.downloadpath = downloadpath;
	}
	public String getDownloadpath(){
		return downloadpath;
	}
	public void setApplycd(String applycd){
		this.applycd = applycd;
	}
	public String getApplycd(){
		return applycd;
	}
	public void setImagfileid(int imagfileid){
		this.imagfileid = imagfileid;
	}
	public int getImagfileid(){
		return imagfileid;
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
}
