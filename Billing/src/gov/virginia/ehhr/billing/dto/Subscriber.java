package gov.virginia.ehhr.billing.dto;

import java.io.Serializable;

public class Subscriber implements Serializable {

	private static final long serialVersionUID = -7252682728633346703L;
	private String subscriberId;
	private String subscriberName;
	private String subscriberType;
	private String accountCreatedBy;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipcode;	
	private String createDate;
	private String updateDate;
	
	public String getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getSubscriberName() {
		return subscriberName;
	}
	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}
	public String getSubscriberType() {
		return subscriberType;
	}
	public void setSubscriberType(String subscriberType) {
		this.subscriberType = subscriberType;
	}
	public String getAccountCreatedBy() {
		return accountCreatedBy;
	}
	public void setAccountCreatedBy(String accountCreatedBy) {
		this.accountCreatedBy = accountCreatedBy;
	}	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
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
		return "Subscriber [subscriberId=" + subscriberId + ", subscriberName="
				+ subscriberName + ", subscriberType=" + subscriberType
				+ ", accountCreatedBy=" + accountCreatedBy + ", address1="
				+ address1 + ", address2=" + address2 + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + ", createDate="
				+ createDate + ", updateDate=" + updateDate + "]";
	}				
}
