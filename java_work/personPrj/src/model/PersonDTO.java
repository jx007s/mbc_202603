package model;

import java.util.Date;


// DTO : Data transfer Object -- 데이터 전달객체
public class PersonDTO {
	String pid,pame,friend,pfid;
    Integer age;
    Double height;
    Date birth, reg_date;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPame() {
		return pame;
	}
	public void setPame(String pame) {
		this.pame = pame;
	}
	public String getFriend() {
		return friend;
	}
	public void setFriend(String friend) {
		this.friend = friend;
	}
	public String getPfid() {
		return pfid;
	}
	public void setPfid(String pfid) {
		this.pfid = pfid;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return pid + "\t" + pame + "\t" + friend + "\t" + pfid + "\t" + age
				+ "\t" + height + "\t" + birth + "\t" + reg_date;
	}
    
    
}
