package bankpayment.restendpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bankpayment.models.CreditCardPayment;

@RestController
public class BankPaymentRestService {

	private static final Logger logger = LoggerFactory.getLogger(BankPaymentRestService.class);
	
	// Insert New Seat Allocation
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, value = "/creditCardPayment")
	public ResponseEntity<?> makeCreditCardPayment(@RequestBody CreditCardPayment paymentModel) {
		logger.info("Recieved POST Request at /bankServices/creditCardPayment");
		logger.info("Bank Payment Status : SUCCESS , Credit Card Number : " + paymentModel.getCreditCardNumber());
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}
