package com.TestPackage;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=5)
	public void sum(){
		
	int a=10;
	int b=20;
	int c=a+b;
	
	System.out.println("sum of two no. is----"+c);
	}
	
	//if I WANT TO RUN one test case mulitple times so I WILL use this invoation count
	//keyword
}
