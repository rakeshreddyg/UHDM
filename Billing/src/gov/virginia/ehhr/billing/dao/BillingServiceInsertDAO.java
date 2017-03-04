package gov.virginia.ehhr.billing.dao;

import gov.virginia.ehhr.billing.dto.Subscriber;
import gov.virginia.ehhr.billing.dto.Subscription;
import gov.virginia.ehhr.billing.dto.User;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

@Component
public class BillingServiceInsertDAO implements Serializable {

	private static final long serialVersionUID = 2962383031480808539L;
	CreateConnection createConnection;
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pst = null;	
	ResultSet rs = null;
	
	public void addUserDetails(User user) throws SQLException{
		
		String emailId = user.getEmailId();
		String psw = user.getPassword();
		Date createDate = getCurrentDatetime();	
		String updateDate = user.getUpdateDate();
		createConnection = new CreateConnection();
		try {
			con = createConnection.getConnection();
			pst =(PreparedStatement) con.prepareStatement("insert into BILL_DMAS.LOGIN(EMAIL_ID,PASSWORD,CREATE_DATE,UPDATE_DATE) values(?,?,?,?)");
			pst.setString(1, emailId);
			pst.setString(2, psw);					
			pst.setDate(3, createDate);
			pst.setString(4, updateDate);
			int i= pst.executeUpdate();
			con.commit();
			String msg="";
			if(i!=0){
				msg="Record inserted successfully ";
				System.out.println(msg);
			}else{
				msg="failed to insert the data";
				System.out.println(msg);
			}
			//pst.close();
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
	
	public java.sql.Date getCurrentDatetime() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}	

	public void addSubscriber(Subscriber subscriber) throws SQLException{
		//String subId = subscriber.getSubscriberId();
		String subName = subscriber.getSubscriberName();
		String subType = subscriber.getSubscriberType();
		String accCreatedBy = subscriber.getAccountCreatedBy();
		String address1 = subscriber.getAddress1();
		String address2 = subscriber.getAddress2();
		String city = subscriber.getCity();
		String state = subscriber.getState();
		String zipcode = subscriber.getZipcode();
		Date updateDate = getCurrentDatetime();
		Date createDate = getCurrentDatetime();
		
		createConnection = new CreateConnection();
		try {
			con = createConnection.getConnection();
			pst = con.prepareStatement("insert into BILL_DMAS.SUBSCRIBER(SUBSCRIBER_NAME,SUBSCRIBER_TYPE,ACCOUNT_CREATED_BY,ADDRESS_1,ADDRESS_2,CITY,STATE,ZIPCODE,CREATE_DATE,UPDATE_DATE) values (?,?,?,?,?,?,?,?,?,?)");
			
			pst.setString(1, subName);
			pst.setString(2, subType);
			pst.setString(3, accCreatedBy);
			pst.setString(4, address1);
			pst.setString(5, address2);
			pst.setString(6, city);
			pst.setString(7, state);
			pst.setString(8, zipcode);
			pst.setDate(9, createDate);
			pst.setDate(10, updateDate);
			
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
			//pst.close();
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
	
	public void addSubscription(Subscription subscription) throws SQLException{		
		
		//String subscId = subscription.getSubscriptionId();
		String recType = subscription.getRecordType();
		String beginDate1 = subscription.getSubscriptionBeginDate();
		String endDate1 = subscription.getSubscriptionEndDate();
		String subscPriType = subscription.getSubscriptionPricingType();
		String SubscPriTypeRate = subscription.getSubscriptionPricingTypeRate();
		String agenFee = subscription.getAgenciesFee();
		String accCreatedBy = subscription.getAccountCreatedBy();
		Date deactivateDate = getCurrentDatetime();
		String activeFlag = "1";
		String firstName = subscription.getFirstName();
		String lastName = subscription.getLastName();
		String suffix = subscription.getSuffix();
		String emailId = subscription.getEmailId();
		String phoneNumber = subscription.getPhoneNumber();
		String firstName1 = subscription.getFirstName1();
		String lastName1 = subscription.getLastName1();
		String suffix1 = subscription.getSuffix1();
		String emailId1 = subscription.getEmailId1();
		String phoneNumber1 = subscription.getPhoneNumber1();
		String firstName2 = subscription.getFirstName2();
		String lastName2 = subscription.getLastName2();
		String suffix2 = subscription.getSuffix2();
		String emailId2 = subscription.getEmailId2();
		String phoneNumber2 = subscription.getPhoneNumber2();
		String firstName3 = subscription.getFirstName3();
		String lastName3 = subscription.getLastName3();
		String suffix3 = subscription.getSuffix3();
		String emailId3 = subscription.getEmailId3();
		String phoneNumber3 = subscription.getPhoneNumber3();		
		
		String subscriberId = subscription.getSubscriberId();
		Date updateDate = getCurrentDatetime();
		Date createDate = getCurrentDatetime();
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
		String beginDate = null;
		String endDate = null;
		try {
			beginDate = formatter.format(dateFormatter.parse(beginDate1));
			endDate = formatter.format(dateFormatter.parse(endDate1));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		createConnection = new CreateConnection();
		try {
			con = createConnection.getConnection();
			String query = "INSERT into BILL_DMAS.SUBSCRIPTION(RECORD_TYPE,SUBSCRIPTION_BEGIN_DATE,SUBSCRIPTION_END_DATE," +
					"SUBSCRIPTION_PRICING_TYPE,SUBSCRIPTION_PRICING_TYPE_RATE,FEE_CHARGED_BY_OTHER_AGENCIES,ACCOUNT_CREATED_BY,"+
					"SUBSCRIBER_ID,ACTIVE_FLAG,SUBSCRIPTION_DEACTIVATE_DATE,CREATE_DATE,UPDATE_DATE,FIRST_NAME,LAST_NAME,SUFFIX,EMAIL_ID,"+
					"PHONE_NUMBER,FIRST_NAME_1,LAST_NAME_1,SUFFIX_1,EMAIL_ID_1,PHONE_NUMBER_1,FIRST_NAME_2,LAST_NAME_2,SUFFIX_2,"+
					"EMAIL_ID_2,PHONE_NUMBER_2,FIRST_NAME_3,LAST_NAME_3,SUFFIX_3,EMAIL_ID_3,PHONE_NUMBER_3) "+
					"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			//pst = con.prepareStatement("insert into SUBSCRIPTION(RECORD_TYPE,SUBSCRIPTION_BEGIN_DATE,SUBSCRIPTION_END_DATE,SUBSCRIPTION_PRICING_TYPE,SUBSCRIPTION_PRICING_TYPE_RATE,FEE_CHARGED_BY_OTHER_AGENCIES,ACCOUNT_CREATED_BY,SUBSCRIBER_ID,ACTIVE_FLAG,CREATE_DATE,UPDATE_DATE) values(?,?,?,?,?,?,?,?,?,?,?)");
			pst = con.prepareStatement(query);	
			//pst.setString(1, subscId);
			pst.setString(1, recType);
			pst.setString(2, beginDate);			
			pst.setString(3, endDate);
			pst.setString(4, subscPriType);
			pst.setString(5, SubscPriTypeRate);
			pst.setString(6, agenFee);
			pst.setString(7, accCreatedBy);
			pst.setString(8, subscriberId);
			pst.setString(9, activeFlag);
			pst.setDate(10, deactivateDate);			
			pst.setDate(11, createDate);
			pst.setDate(12, updateDate);
			pst.setString(13, firstName);
			pst.setString(14, lastName);
			pst.setString(15, suffix);
			pst.setString(16, emailId);
			pst.setString(17, phoneNumber);
			pst.setString(18, firstName1);
			pst.setString(19, lastName1);
			pst.setString(20, suffix1);
			pst.setString(21, emailId1);
			pst.setString(22, phoneNumber1);
			pst.setString(23, firstName2);
			pst.setString(24, lastName2);
			pst.setString(25, suffix2);
			pst.setString(26, emailId2);
			pst.setString(27, phoneNumber2);
			pst.setString(28, firstName3);
			pst.setString(29, lastName3);
			pst.setString(30, suffix3);
			pst.setString(31, emailId3);
			pst.setString(32, phoneNumber3);			
			
			int i = pst. executeUpdate();
			
			con.commit();
			String msg="";
			if(i!=0){
				msg="Records inserted successfully ";
				System.out.println(msg);				
			}else{
				msg="failed to insert the data";
				System.out.println(msg);
			}
			//pst.close();
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
