package gov.virginia.ehhr.billing;

import gov.virginia.ehhr.billing.dto.Subscriber;
import gov.virginia.ehhr.billing.dto.Subscription;
import gov.virginia.ehhr.billing.dto.User;

//import java.io.File;
import java.sql.SQLException;

//import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BillingController {
	
	static Logger LOGGER = LoggerFactory.getLogger(BillingController.class);
	
	@Autowired
	BillingServiceImpl billingServiceImpl;	
	
	@RequestMapping(value = "/post-userRegistration", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	@ResponseBody
	public BillingServiceResponse insertUserDetails(@RequestBody User user){
		BillingServiceResponse svcsResponse = new BillingServiceResponse();
		try{
			billingServiceImpl.addUserDetails(user);
			svcsResponse.setStatusCode(200);
		}catch (Exception e) {
			svcsResponse.setStatusCode(500);
			svcsResponse.setErrorMessage(e.getMessage());
		}
		return svcsResponse;
	}
	
	@RequestMapping(value = "/addSubscriber", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	@ResponseBody
	public BillingServiceResponse insertSubscriber(@RequestBody Subscriber subscriber){
		BillingServiceResponse svcsResponse = new BillingServiceResponse();
		try{
			billingServiceImpl.addSubscriber(subscriber);
			svcsResponse.setStatusCode(200);
		}catch (Exception e) {
			svcsResponse.setStatusCode(500);
			svcsResponse.setErrorMessage(e.getMessage());
		}
		return svcsResponse;
	}
	
	@RequestMapping(value = "/addSubscription", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	@ResponseBody
	public BillingServiceResponse insertSubscription(@RequestBody Subscription subscription){
		BillingServiceResponse svcsResponse = new BillingServiceResponse();
		try{
			billingServiceImpl.addSubscription(subscription);
			svcsResponse.setStatusCode(200);
		}catch (Exception e) {
			svcsResponse.setStatusCode(500);
			svcsResponse.setErrorMessage(e.getMessage());
		}
		return svcsResponse;
	}
	
	@RequestMapping(value = "/getSubscribers", method = RequestMethod.GET, produces = {"application/json"})
	@ResponseBody
	public BillingServiceResponse getSubscribers() throws SQLException{
		BillingServiceResponse svcsResponse = new BillingServiceResponse();
		svcsResponse.setSubscriberList(billingServiceImpl.getSubscribers());
		return svcsResponse;
	}
	
	@RequestMapping(value = "/subscriber", method = RequestMethod.GET, produces = {"application/json"})
	@ResponseBody
	public BillingServiceResponse getSubscriber(@RequestParam(value="id") String subscriberId) throws SQLException{
		BillingServiceResponse svcsResponse = new BillingServiceResponse();
		svcsResponse.setSubscriberList(billingServiceImpl.getSubscriber(subscriberId));
		return svcsResponse;
	}
	
	@RequestMapping(value = "/subscriber/subscriptions", method = RequestMethod.GET, produces = {"application/json"})
	@ResponseBody
	public BillingServiceResponse getSubscriberDetails(@RequestParam(value="id") String subsrciberId) throws SQLException{
		BillingServiceResponse svcsResponse = new BillingServiceResponse();
		svcsResponse.setSubscriptionList(billingServiceImpl.getSubscriptions(subsrciberId));
		return svcsResponse;
	}
	
	@RequestMapping(value = "/subscription", method = RequestMethod.GET, produces = {"application/json"})
	@ResponseBody
	public BillingServiceResponse getSubscription(@RequestParam(value="id") String subsrciptionId) throws SQLException{
		BillingServiceResponse svcsResponse = new BillingServiceResponse();
		svcsResponse.setSubscriptionList(billingServiceImpl.getSubscription(subsrciptionId));
		return svcsResponse;
	}
	
	@RequestMapping(value = "/updateSubscriber", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	@ResponseBody
	public BillingServiceResponse updateSubscriber(@RequestBody Subscriber subscriber) throws SQLException{
		BillingServiceResponse svcsResponse = new BillingServiceResponse();
		try{
			billingServiceImpl.updateSubscriber(subscriber);
			svcsResponse.setStatusCode(200);
		}catch (Exception e) {
			svcsResponse.setStatusCode(500);
			svcsResponse.setErrorMessage(e.getMessage());
		}
		return svcsResponse;
	}
	
	@RequestMapping(value = "/updateSubscription", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	@ResponseBody
	public BillingServiceResponse updateSubscription(@RequestBody Subscription subscription) throws SQLException{
		BillingServiceResponse svcsResponse = new BillingServiceResponse();
		try{
			billingServiceImpl.updateSubscription(subscription);
			svcsResponse.setStatusCode(200);
		}catch (Exception e) {
			svcsResponse.setStatusCode(500);
			svcsResponse.setErrorMessage(e.getMessage());
		}
		return svcsResponse;
	}	
}
