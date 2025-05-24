package Day_44;

import org.testng.annotations.Test;

public class SignupTest {
	
	@Test(priority = 1,groups = {"regression"})
	void signupByEmail() 
	{
		System.out.println("Signup by email success");
	}
	@Test(priority = 2,groups = {"regression"})
	void signupbyFB() {
		System.out.println("signup by facebook sucess");
	}
	@Test(priority = 3,groups = {"regression"})
	void signupbyTwitter() {
		System.out.println("Signup by twitter succcess ");
	}

}
