package gov.virginia.ehhr.billing;

import gov.virginia.ehhr.billing.dao.BillingServiceInsertDAO;
import gov.virginia.ehhr.billing.dao.BillingServiceUpdateDAO;
import gov.virginia.ehhr.billing.dto.Subscriber;
import gov.virginia.ehhr.billing.dto.Subscription;
import gov.virginia.ehhr.billing.dto.User;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillingServiceImpl implements Serializable {
	
	@Autowired
	BillingServiceInsertDAO billingServiceInsertDao;
	@Autowired
	BillingServiceUpdateDAO billingServiceUpdateDao;
	
	private static final long serialVersionUID = -6010175515653661304L;
	
	public void addUserDetails(User user) throws SQLException{
		billingServiceInsertDao.addUserDetails(user);
	}
	
	public void addSubscriber(Subscriber subscriber) throws SQLException{
		billingServiceInsertDao.addSubscriber(subscriber);
	}
	
	public void addSubscription(Subscription subscription) throws SQLException{
		billingServiceInsertDao.addSubscription(subscription);
	}
	
	public List<Subscriber> getSubscribers() throws SQLException{
		List<Subscriber> subscriberList=new ArrayList<Subscriber>();
		subscriberList.addAll(billingServiceUpdateDao.getSubscribers());
		return subscriberList;
	}
	
	public List<Subscription> getSubscriptions(String subscriberId) throws SQLException{
		List<Subscription> subscriptionList=new ArrayList<Subscription>();
		subscriptionList.addAll(billingServiceUpdateDao.getSubscriptions(subscriberId));
		return subscriptionList;
	}
	
	public List<Subscriber> getSubscriber(String subscriberId) throws SQLException{
		List<Subscriber> subscriberList=new ArrayList<Subscriber>();
		subscriberList.addAll(billingServiceUpdateDao.getSubscriber(subscriberId));
		return subscriberList;
	}
	
	public List<Subscription> getSubscription(String subsrciptionId) throws SQLException{
		List<Subscription> subscriptionList=new ArrayList<Subscription>();
		subscriptionList.addAll(billingServiceUpdateDao.getSubscription(subsrciptionId));
		return subscriptionList;
	}
	
	public void updateSubscriber(Subscriber subscriber) throws SQLException{
		billingServiceUpdateDao.updateSubscriber(subscriber);
	}
	
	public void updateSubscription(Subscription subscription) throws SQLException{
		billingServiceUpdateDao.updateSubscription(subscription);
	}

}
