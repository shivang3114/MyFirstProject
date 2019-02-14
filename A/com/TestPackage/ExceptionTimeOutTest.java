package com.TestPackage;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	
/*	@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void infiniteLoopTest(){
		int i=1;
		while(i==1){
		System.out.println(i);
		}
//it will run infinite time because we have not terminated a loop
		
		}  */
	
        @Test(expectedExceptions=NumberFormatException.class)
        public void test1(){
        	
        	String x="100A";
        	Integer.parseInt(x);
            
        }


}
