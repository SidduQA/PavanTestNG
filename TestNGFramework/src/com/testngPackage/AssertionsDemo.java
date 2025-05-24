package com.testngPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	
	@Test
	void testTittle() {
		    String exp_tittle="Open cart";
		    String act_tittle="Open shop";
		    
		/*   if(exp_tittle.equals(act_tittle)) {
			   System.out.println("test passed");
		   }
		   else
		   {
			   System.out.println("Test failed");
		   }*/
		    
		    Assert.assertEquals(act_tittle, exp_tittle);
	}

}
