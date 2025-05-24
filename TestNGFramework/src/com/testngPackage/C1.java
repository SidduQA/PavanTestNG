package com.testngPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class C1 {
  @Test
  public void Advancedsearch() {
	  System.out.println("This is advanced search");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Login successfully");
  }

}
