package gov.virginia.ehhr.billing;

import gov.virginia.ehhr.billing.dto.Subscriber;
import gov.virginia.ehhr.billing.dto.Subscription;

import java.io.Serializable;
import java.util.List;

public class BillingServiceResponse implements Serializable {

	private static final long serialVersionUID = -5160310086850536693L;
	
	private int statusCode;
	private int errorCode;
	private String errorMessage;
	private List<Subscriber> subscriberList;
	private List<Subscription> subscriptionList;

	public List<Subscription> getSubscriptionList() {
		return subscriptionList;
	}

	public void setSubscriptionList(List<Subscription> subscriptionList) {
		this.subscriptionList = subscriptionList;
	}

	public List<Subscriber> getSubscriberList() {
		return subscriberList;
	}

	public void setSubscriberList(List<Subscriber> subscriberList) {
		this.subscriberList = subscriberList;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
