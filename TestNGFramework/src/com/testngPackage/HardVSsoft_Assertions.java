package com.testngPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVSsoft_Assertions {
//	@Test
	void hard_test() {
		
		System.out.println("testng................");
		System.out.println("testng................");
		
		Assert.assertEquals(1,1);
		
		System.out.println("testng................");
		System.out.println("testng................");

	}
	
	@Test
	void soft_test() {

		System.out.println("testng................");
		System.out.println("testng................");
		
		SoftAssert so=new SoftAssert();
		
		so.assertEquals(1,2);   // soft assertion will always pass if we will not assert all method at the end of the test methos
		
		System.out.println("testng................");
		System.out.println("testng................");
		
		so.assertAll();//mandatory

		
		
	}

}
