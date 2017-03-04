package gov.virginia.ehhr.billing.dao;

import gov.virginia.ehhr.billing.dto.Subscriber;
import gov.virginia.ehhr.billing.dto.Subscription;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BillingServiceUpdateDAO implements Serializable {

	private static final long serialVersionUID = 2962383031480808539L;
	CreateConnection createConnection;
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
		
	public List<Subscriber> getSubscribers() throws SQLException{
		
		List<Subscriber> subscriberList = new ArrayList<Subscriber>();		
		String query = "select * from BILL_DMAS.SUBSCRIBER";
		createConnection = new CreateConnection();
		try {
			con = createConnection.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Subscriber subscriber = new Subscriber();
				subscriber.setSubscriberId(rs.getString("SUBSCRIBER_ID"));
				subscriber.setSubscriberName(rs.getString("SUBSCRIBER_NAME"));
				subscriber.setSubscriberType(rs.getString("SUBSCRIBER_TYPE"));				
				subscriber.setAccountCreatedBy(rs.getString("ACCOUNT_CREATED_BY"));
				subscriber.setAddress1(rs.getString("ADDRESS_1"));
				subscriber.setAddress2(rs.getString("ADDRESS_2"));
				subscriber.setCity(rs.getString("CITY"));
				subscriber.setState(rs.getString("STATE"));
				subscriber.setZipcode(rs.getString("ZIPCODE"));
				subscriber.setCreateDate(rs.getString("CREATE_DATE"));
				subscriber.setUpdateDate(rs.getString("UPDATE_DATE"));
				subscriberList.add(subscriber);
			}
		} catch (SQLException e ) {
			e.printStackTrace();
		} finally {
			if(rs!=null){
				rs.close();
			}
			if(stmt!= null){
				stmt.close();
			}
			if(con!= null){
				con.close();
			}
		}
		return subscriberList;
	}
	
	public List<Subscription> getSubscriptions(String subscriberId) throws SQLException{
		
		List<Subscription> subscriptionList = new ArrayList<Subscription>();
		
		String query = "select * from BILL_DMAS.SUBSCRIPTION where SUBSCRIPTION.SUBSCRIBER_ID="+subscriberId;
		createConnection = new CreateConnection();
		try {
			con = createConnection.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Subscription subscription = new Subscription();
				subscription.setSubscriberId(rs.getString("SUBSCRIBER_ID"));
				subscription.setSubscriptionId(rs.getString("SUBSCRIPTION_ID"));
				subscription.setRecordType(rs.getString("RECORD_TYPE"));
				
				String beginDate1 = rs.getString("SUBSCRIPTION_BEGIN_DATE");
				String endDate1 = rs.getString("SUBSCRIPTION_END_DATE");
				
				SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
				String beginDate = null;
				String endDate = null;
				try {
					beginDate = formatter.format(dateFormatter.parse(beginDate1));
					endDate = formatter.format(dateFormatter.parse(endDate1));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				subscription.setSubscriptionBeginDate(beginDate);
				subscription.setSubscriptionEndDate(endDate);
				subscription.setSubscriptionPricingType(rs.getString("SUBSCRIPTION_PRICING_TYPE"));
				subscription.setSubscriptionPricingTypeRate(rs.getString("SUBSCRIPTION_PRICING_TYPE_RATE"));
				subscription.setAgenciesFee(rs.getString("FEE_CHARGED_BY_OTHER_AGENCIES"));
				subscription.setAccountCreatedBy(rs.getString("ACCOUNT_CREATED_BY"));
				subscription.setActiveFlag(rs.getString("ACTIVE_FLAG"));
				subscription.setSubscriptionDeactivateDate(rs.getString("SUBSCRIPTION_DEACTIVATE_DATE"));
				subscription.setFirstName(rs.getString("FIRST_NAME"));
				subscription.setLastName(rs.getString("LAST_NAME"));
				subscription.setSuffix(rs.getString("SUFFIX"));
				subscription.setEmailId(rs.getString("EMAIL_ID"));
				subscription.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				subscription.setFirstName1(rs.getString("FIRST_NAME_1"));
				subscription.setLastName1(rs.getString("LAST_NAME_1"));
				subscription.setSuffix1(rs.getString("SUFFIX_1"));
				subscription.setEmailId1(rs.getString("EMAIL_ID_1"));
				subscription.setPhoneNumber1(rs.getString("PHONE_NUMBER_1"));
				subscription.setFirstName2(rs.getString("FIRST_NAME_2"));
				subscription.setLastName2(rs.getString("LAST_NAME_3"));
				subscription.setSuffix2(rs.getString("SUFFIX_2"));
				subscription.setEmailId2(rs.getString("EMAIL_ID_2"));
				subscription.setPhoneNumber2(rs.getString("PHONE_NUMBER_2"));
				subscription.setFirstName3(rs.getString("FIRST_NAME_3"));
				subscription.setLastName3(rs.getString("LAST_NAME_3"));
				subscription.setSuffix3(rs.getString("SUFFIX_3"));
				subscription.setEmailId3(rs.getString("EMAIL_ID_3"));
				subscription.setPhoneNumber3(rs.getString("PHONE_NUMBER_3"));
				subscription.setCreateDate(rs.getString("CREATE_DATE"));
				subscription.setUpdateDate(rs.getString("UPDATE_DATE"));
				subscriptionList.add(subscription);
			}			
		} catch (SQLException e ) {
			e.printStackTrace();
		} finally {
			if(rs!=null){
				rs.close();
			}
			if(stmt!= null){
				stmt.close();
			}
			if(con!= null){
				con.close();
			}
		}
		return subscriptionList;
	}
	
	public List<Subscriber> getSubscriber(String subscriberId) throws SQLException{
		
		List<Subscriber> subscriberList = new ArrayList<Subscriber>();
		String query = "select * from BILL_DMAS.SUBSCRIBER where SUBSCRIBER.SUBSCRIBER_ID = "+subscriberId;
		createConnection = new CreateConnection();
		try {
			con = createConnection.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Subscriber subscriber = new Subscriber();
				subscriber.setSubscriberId(rs.getString("SUBSCRIBER_ID"));
				subscriber.setSubscriberName(rs.getString("SUBSCRIBER_NAME"));
				subscriber.setSubscriberType(rs.getString("SUBSCRIBER_TYPE"));				
				subscriber.setAccountCreatedBy(rs.getString("ACCOUNT_CREATED_BY"));
				subscriber.setAddress1(rs.getString("ADDRESS_1"));
				subscriber.setAddress2(rs.getString("ADDRESS_2"));
				subscriber.setCity(rs.getString("CITY"));
				subscriber.setState(rs.getString("STATE"));
				subscriber.setZipcode(rs.getString("ZIPCODE"));
				subscriber.setCreateDate(rs.getString("CREATE_DATE"));
				subscriber.setUpdateDate(rs.getString("UPDATE_DATE"));
				subscriberList.add(subscriber);
			}
		} catch (SQLException e ) {
			e.printStackTrace();
		} finally {
			if(rs!=null){
				rs.close();
			}
			if(stmt!= null){
				stmt.close();
			}
			if(con!= null){
				con.close();
			}
		}
		return subscriberList;
	}
	
public List<Subscription> getSubscription(String subscriptionId) throws SQLException{
		
		List<Subscription> subscriptionList = new ArrayList<Subscription>();
		
		String query = "select * from BILL_DMAS.SUBSCRIPTION where SUBSCRIPTION.SUBSCRIPTION_ID="+subscriptionId;
		createConnection = new CreateConnection();
		try {
			con = createConnection.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Subscription subscription = new Subscription();
				subscription.setSubscriberId(rs.getString("SUBSCRIBER_ID"));
				subscription.setSubscriptionId(rs.getString("SUBSCRIPTION_ID"));
				subscription.setRecordType(rs.getString("RECORD_TYPE"));
				
				String beginDate1 = rs.getString("SUBSCRIPTION_BEGIN_DATE");
				String endDate1 = rs.getString("SUBSCRIPTION_END_DATE");
				
				SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
				String beginDate = null;
				String endDate = null;
				try {
					beginDate = formatter.format(dateFormatter.parse(beginDate1));
					endDate = formatter.format(dateFormatter.parse(endDate1));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				subscription.setSubscriptionBeginDate(beginDate);
				subscription.setSubscriptionEndDate(endDate);
				subscription.setSubscriptionPricingType(rs.getString("SUBSCRIPTION_PRICING_TYPE"));
				subscription.setSubscriptionPricingTypeRate(rs.getString("SUBSCRIPTION_PRICING_TYPE_RATE"));
				subscription.setAgenciesFee(rs.getString("FEE_CHARGED_BY_OTHER_AGENCIES"));
				subscription.setAccountCreatedBy(rs.getString("ACCOUNT_CREATED_BY"));
				subscription.setActiveFlag(rs.getString("ACTIVE_FLAG"));
				subscription.setCreateDate(rs.getString("CREATE_DATE"));
				subscription.setUpdateDate(rs.getString("UPDATE_DATE"));
				subscriptionList.add(subscription);
			}			
		} catch (SQLException e ) {
			e.printStackTrace();
		} finally {
			if(rs!=null){
				rs.close();
			}
			if(stmt!= null){
				stmt.close();
			}
			if(con!= null){
				con.close();
			}
		}
		return subscriptionList;
	}
	
	
	public java.sql.Date getCurrentDatetime() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}

	public void updateSubscriber(Subscriber subscriber) throws SQLException{
		
		createConnection = new CreateConnection();
		try {			
			String subscriberId = subscriber.getSubscriberId();
			String subscriberType = subscriber.getSubscriberType();		
			String accountCreatedBy = subscriber.getAccountCreatedBy();
			String address1 = subscriber.getAddress1();
			String address2 = subscriber.getAddress2();
			String city = subscriber.getCity();
			String state = subscriber.getState();
			String zipcode = subscriber.getZipcode();
			Date updateDate = getCurrentDatetime();
			
			con = createConnection.getConnection();					
			
			String sql = "UPDATE BILL_DMAS.SUBSCRIBER SET SUBSCRIBER_TYPE = ?,ACCOUNT_CREATED_BY = ?,ADDRESS_1 = ?,ADDRESS_2 = ?,CITY = ?,STATE = ?, ZIPCODE = ?, UPDATE_DATE = ? where SUBSCRIBER_ID = ?";
			pst = con.prepareStatement(sql);
			
			pst.setString(1, subscriberType);			
			pst.setString(2, accountCreatedBy);
			pst.setString(3, address1);
			pst.setString(4, address2);
			pst.setString(5, city);
			pst.setString(6, state);
			pst.setString(7, zipcode);
			pst.setDate(8,updateDate);
			pst.setString(9, subscriberId);
			
			int i = pst.executeUpdate();			
			con.commit();
			
			String msg="";
			if(i!=0){
				msg="Record updated successfully ";
				System.out.println(msg);
			}else{
				msg="failed to update the data";
				System.out.println(msg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(pst!= null){
				pst.close();
			}
			if(con!= null){
				con.close();
			}
		}
	}
	
	public void updateSubscription(Subscription subscription) throws SQLException{
		
		createConnection = new CreateConnection();
		try {
			String subscriptionId = subscription.getSubscriptionId();
			String recordType = subscription.getRecordType();
			String beginDate = subscription.getSubscriptionBeginDate();
			String endDate = subscription.getSubscriptionEndDate();
			String pricingType = subscription.getSubscriptionPricingType();
			String pricingTypeRate = subscription.getSubscriptionPricingTypeRate();
			String agenciesFee = subscription.getAgenciesFee();
			String accountCreatedBy = subscription.getAccountCreatedBy();
			Date updateDate = getCurrentDatetime();
			
			con = createConnection.getConnection();			
	        String query = "UPDATE BILL_DMAS.SUBSCRIPTION SET RECORD_TYPE =?, SUBSCRIPTION_BEGIN_DATE = ?, SUBSCRIPTION_END_DATE = ?, SUBSCRIPTION_PRICING_TYPE = ?, SUBSCRIPTION_PRICING_TYPE_RATE = ?, FEE_CHARGED_BY_OTHER_AGENCIES = ?, ACCOUNT_CREATED_BY = ?, UPDATE_DATE = ?  where SUBSCRIPTION_ID= ?";
	        pst = con.prepareStatement(query);
	        
	        pst.setString(1, recordType);
	        pst.setString(2, beginDate);
	        pst.setString(3, endDate);
	        pst.setString(4, pricingType);
	        pst.setString(5, pricingTypeRate);
	        pst.setString(6, agenciesFee);
	        pst.setString(7, accountCreatedBy);
	        pst.setDate(8, updateDate);
	        pst.setString(9, subscriptionId);
	        
	        int i = pst.executeUpdate();
			con.commit();
			
			String msg="";
			if(i!=0){
				msg="Record inserted successfully ";
				System.out.println(msg);
			}else{
				msg="failed to insert the data";
				System.out.println(msg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(pst!= null){
				pst.close();
			}
			if(con!= null){
				con.close();
			}
		}
	}
}
