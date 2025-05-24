package Day_44;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority = 1,groups = {"sanity"})
	void loginbyEmail() 
	{
		System.out.println("Login By Email sucess");
	}
	
	@Test(priority = 2,groups = {"sanity"})
	void loginByFB() 
	{
		System.out.println("Login By FB Success");
	}
	
	@Test(priority = 3,groups = {"sanity"})
	void LoginByTwitter() 
	{
		System.out.println("Login By twitter success");
	}

}
