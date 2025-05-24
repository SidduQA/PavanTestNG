package com.testngPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


/*TC 2
1)LOGIN
2)SEARCH
3)ADVANCED SEARCH
4)LOGOUT
*/

public class AnnotationsDemo2 {
 @BeforeClass
  public void beforeClass() {
		  System.out.println("Login successfully");
	  }
	
	@Test
  public void SEARCH() {
	  System.out.println("This is search ");
  }
  @Test
  void advancedSearch() {
	  System.out.println("This is advanced search");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("Logout successfully");
  }

}
