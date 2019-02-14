package com.TestPackage;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	//Pre-conditions annotations---starting with @before
	
	@BeforeSuite   //1----first prefrence always go
	public void setUP(){
		
		System.out.println("@BeforeSuite ---setup system property");
	}
	@BeforeTest   //2---immidately execute this
    public void launchthebrowser(){
    	
    	System.out.println("@BEFORETEST---launch successfully");
    }
	
	@BeforeClass()  //3--
	public void Login(){
		
		System.out.println("@BEFORECLASS---login");
	}
	
	/* 
	 * @BeforeMethod
	 * @Testcase no1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @TestCAseNo2
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @TestCase NUmber3
	 * @AfterMethod*/
	
	
	
	
	 @BeforeMethod   //4
	public void enterURL(){
		
		System.out.println("@BeforeMethod ---enter URL");
	}
	 
    //this is my test case--starting with @Test
	 
	@Test   //5--executed
	public void googleTitle(){
		
		System.out.println("@Test---google title as expected");	
	}
	
	@Test
	public void verifyURL(){
		
		System.out.println("@Test---url is correct");
	}
	
	@Test
	public void verifyButton(){
		System.out.println("@Test---button is enabled");
	}
	
    //Post conditions---starts with @after 
	
     @AfterMethod    //6--executed
     public void logout(){
    	 
    	 System.out.println("@AfterMethod ---logout successfully");
     }
                         
     @AfterClass            //7--executed
     public void closeBrowser(){
   	  
   	  System.out.println("@AfterClass   --browser closed successfully");
     }
     
     
     @AfterTest                  //8--executed---last preference for execution sequence.
     public void deleteAllCookies(){
    	 
    	 System.out.println("@AfterTest  ---cookies delted successfully");
     }

      
 
      @AfterSuite                      //9
      public void generateReports(){
    	  
    	 System.out.println("results will come");
      }

}
