package com.testngPackage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
/*	Types of assertions 
	1)Hard assertions  == which methods  we  access directly from assert class called hard assertions
    2)Soft assertions  == these methods are not accessed from assert class we need to access from soft assert predefined object 
    */
	
	@Test
	public void test() {
		
//		Assert.assertEquals("xyz", "xyz");//pass
//		Assert.assertEquals("abc", "xyz"); //filed
		
		Assert.assertEquals(123, 123);   //pass
		Assert.assertEquals("abc", 123);//failed
		
		Assert.assertNotEquals(123, 325); //pass
		Assert.assertNotEquals(222, 222);  //failed
		
        Assert.assertTrue(true);	 //passed
        Assert.assertTrue(false);   //failed
        
        Assert.assertTrue(1==2);//failed
        Assert.assertTrue(1==1);//passed
        
        Assert.assertFalse(false);//passed
        Assert.assertFalse(true); //failed
        
        Assert.fail();
		
	}
	
	
	
	

}
