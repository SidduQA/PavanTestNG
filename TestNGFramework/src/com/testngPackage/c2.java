package com.testngPackage;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class c2 {
  @Test
  public void search() {
	  System.out.println("This is search");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("Logout successfully");
  }

}
