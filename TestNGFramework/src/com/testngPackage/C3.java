package com.testngPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class C3 {
  @Test
  public void pqr() {
	  System.out.println("This is pqr c3 class ");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Thia ia befor suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite");
  }

}
