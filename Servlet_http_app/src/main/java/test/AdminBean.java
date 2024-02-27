package test;
import java.io.*;

@SuppressWarnings("serial")
public class AdminBean implements Serializable {
	private String uName,pWord,fName,lName,addr,mId;
	private long phNo;
	public String getuName() {
		return uName;
	}
	public String getpWord() {
		return pWord;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public String getAddr() {
		return addr;
	}
	public String getmId() {
		return mId;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public AdminBean() {}
}
