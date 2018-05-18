package	com.cango;
public class IZdzFileManagement {
	private int fileId;
	private String foreignKey;
	private short fileType;
	private short type;
	private short subClass;
	private String path;
	private int imageFileId;
	private Date createDateTime;
	private int createUser;
	private Date lastUpdateTime;
	private int updateUser;
	public void setFileId(int fileId){
		this.fileId = fileId;
	}
	public int getFileId(){
		return fileId;
	}
	public void setForeignKey(String foreignKey){
		this.foreignKey = foreignKey;
	}
	public String getForeignKey(){
		return foreignKey;
	}
	public void setFileType(short fileType){
		this.fileType = fileType;
	}
	public short getFileType(){
		return fileType;
	}
	public void setType(short type){
		this.type = type;
	}
	public short getType(){
		return type;
	}
	public void setSubClass(short subClass){
		this.subClass = subClass;
	}
	public short getSubClass(){
		return subClass;
	}
	public void setPath(String path){
		this.path = path;
	}
	public String getPath(){
		return path;
	}
	public void setImageFileId(int imageFileId){
		this.imageFileId = imageFileId;
	}
	public int getImageFileId(){
		return imageFileId;
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
