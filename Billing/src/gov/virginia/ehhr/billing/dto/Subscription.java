package gov.virginia.ehhr.billing.dto;

import java.io.Serializable;

public class Subscription implements Serializable {

	private static final long serialVersionUID = -439929899820690096L;
	
	private String subscriptionId;
	private String subscriberId;
	private String recordType;
	private String subscriptionBeginDate;
	private String subscriptionEndDate;	
	private String subscriptionPricingType;
	private String subscriptionPricingTypeRate;
	private String agenciesFee;
	private String accountCreatedBy;
	private String activeFlag;
	private String subscriptionDeactivateDate;
	private String createDate;
	private String updateDate;
	private String firstName;
	private String lastName;
	private String suffix;
	private String emailId;
	private String phoneNumber;
	private String firstName1;
	private String lastName1;
	private String suffix1;
	private String emailId1;
	private String phoneNumber1;
	private String firstName2;
	private String lastName2;
	private String suffix2;
	private String emailId2;
	private String phoneNumber2;
	private String firstName3;
	private String lastName3;
	private String suffix3;
	private String emailId3;
	private String phoneNumber3;
	
	public String getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getSubscriptionBeginDate() {
		return subscriptionBeginDate;
	}
	public void setSubscriptionBeginDate(String subscriptionBeginDate) {
		this.subscriptionBeginDate = subscriptionBeginDate;
	}
	public String getSubscriptionEndDate() {
		return subscriptionEndDate;
	}
	public void setSubscriptionEndDate(String subscriptionEndDate) {
		this.subscriptionEndDate = subscriptionEndDate;
	}
	public String getSubscriptionPricingType() {
		return subscriptionPricingType;
	}
	public void setSubscriptionPricingType(String subscriptionPricingType) {
		this.subscriptionPricingType = subscriptionPricingType;
	}
	public String getSubscriptionPricingTypeRate() {
		return subscriptionPricingTypeRate;
	}
	public void setSubscriptionPricingTypeRate(String subscriptionPricingTypeRate) {
		this.subscriptionPricingTypeRate = subscriptionPricingTypeRate;
	}
	public String getAgenciesFee() {
		return agenciesFee;
	}
	public void setAgenciesFee(String agenciesFee) {
		this.agenciesFee = agenciesFee;
	}
	public String getAccountCreatedBy() {
		return accountCreatedBy;
	}
	public void setAccountCreatedBy(String accountCreatedBy) {
		this.accountCreatedBy = accountCreatedBy;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getSubscriptionDeactivateDate() {
		return subscriptionDeactivateDate;
	}
	public void setSubscriptionDeactivateDate(String subscriptionDeactivateDate) {
		this.subscriptionDeactivateDate = subscriptionDeactivateDate;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName1() {
		return firstName1;
	}
	public void setFirstName1(String firstName1) {
		this.firstName1 = firstName1;
	}
	public String getLastName1() {
		return lastName1;
	}
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}
	public String getSuffix1() {
		return suffix1;
	}
	public void setSuffix1(String suffix1) {
		this.suffix1 = suffix1;
	}
	public String getEmailId1() {
		return emailId1;
	}
	public void setEmailId1(String emailId1) {
		this.emailId1 = emailId1;
	}
	public String getPhoneNumber1() {
		return phoneNumber1;
	}
	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}
	public String getFirstName2() {
		return firstName2;
	}
	public void setFirstName2(String firstName2) {
		this.firstName2 = firstName2;
	}
	public String getLastName2() {
		return lastName2;
	}
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	public String getSuffix2() {
		return suffix2;
	}
	public void setSuffix2(String suffix2) {
		this.suffix2 = suffix2;
	}
	public String getEmailId2() {
		return emailId2;
	}
	public void setEmailId2(String emailId2) {
		this.emailId2 = emailId2;
	}
	public String getPhoneNumber2() {
		return phoneNumber2;
	}
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}
	public String getFirstName3() {
		return firstName3;
	}
	public void setFirstName3(String firstName3) {
		this.firstName3 = firstName3;
	}
	public String getLastName3() {
		return lastName3;
	}
	public void setLastName3(String lastName3) {
		this.lastName3 = lastName3;
	}
	public String getSuffix3() {
		return suffix3;
	}
	public void setSuffix3(String suffix3) {
		this.suffix3 = suffix3;
	}
	public String getEmailId3() {
		return emailId3;
	}
	public void setEmailId3(String emailId3) {
		this.emailId3 = emailId3;
	}
	public String getPhoneNumber3() {
		return phoneNumber3;
	}
	public void setPhoneNumber3(String phoneNumber3) {
		this.phoneNumber3 = phoneNumber3;
	}
	
	@Override
	public String toString() {
		return "Subscription [subscriptionId=" + subscriptionId
				+ ", subscriberId=" + subscriberId + ", recordType="
				+ recordType + ", subscriptionBeginDate="
				+ subscriptionBeginDate + ", subscriptionEndDate="
				+ subscriptionEndDate + ", subscriptionPricingType="
				+ subscriptionPricingType + ", subscriptionPricingTypeRate="
				+ subscriptionPricingTypeRate + ", agenciesFee=" + agenciesFee
				+ ", accountCreatedBy=" + accountCreatedBy + ", activeFlag="
				+ activeFlag + ", subscriptionDeactivateDate="
				+ subscriptionDeactivateDate + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", suffix=" + suffix
				+ ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", firstName1=" + firstName1 + ", lastName1=" + lastName1
				+ ", suffix1=" + suffix1 + ", emailId1=" + emailId1
				+ ", phoneNumber1=" + phoneNumber1 + ", firstName2="
				+ firstName2 + ", lastName2=" + lastName2 + ", suffix2="
				+ suffix2 + ", emailId2=" + emailId2 + ", phoneNumber2="
				+ phoneNumber2 + ", firstName3=" + firstName3 + ", lastName3="
				+ lastName3 + ", suffix3=" + suffix3 + ", emailId3=" + emailId3
				+ ", phoneNumber3=" + phoneNumber3 + "]";
	}
	
}
