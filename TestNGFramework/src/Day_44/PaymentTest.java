package Day_44;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test(priority = 1,groups = {"regression","sanity","functional"})
	void paymentInRupees() {
		System.out.println("Payment in Ruppees");
	}
	@Test(priority = 2,groups = {"regression","sanity","functional"})
	void paymentInDollars() {
		System.out.println("Payment in dollars");
	}

}
