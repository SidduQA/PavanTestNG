package com.testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestngPractice {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		
	}
	
	@Test
	
	public void TittleTest() {
		String tittle=driver.getTitle();
	    System.out.println("Tittle of the page is ddvdfdf"+tittle);
	}
	@AfterTest
	public void closebrowser() {
		driver.close();
	
	}
	
     	

}
