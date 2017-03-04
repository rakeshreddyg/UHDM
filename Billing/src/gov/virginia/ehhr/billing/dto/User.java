package gov.virginia.ehhr.billing.dto;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 8619667450090060488L;
	
	private String emailId;
	private String password;
	private String createDate;
	private String updateDate;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "User [emailId=" + emailId
				+ ", password=" + password + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
