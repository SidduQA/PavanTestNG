package com.testngPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

/*TC 2
1)LOGIN
2)SEARCH
3)LOGOUT
5)LOGIN
6)ADVANCED SEARCH
7)LOGOUT
*/

public class AnnotationsDemo1 {
  @Test(priority = 1)
  public void search() {
	  System.out.println("This is search");
  }
  @Test(priority = 2)
  void advancedSearch() {
	  System.out.println("This is advanced search");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Login successfully");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Logout successfully");
  }

}
