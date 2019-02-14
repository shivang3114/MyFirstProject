package com.TestPackage;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test()
	public void login(){
		
		System.out.println("login successfully");
		
	}
	@Test(dependsOnMethods="login")
	public void homepage(){
		
		System.out.println("homepage");
	}
	@Test(dependsOnMethods="login")
	public void SearchPage(){
		
		System.out.println("searched successfully");
		int i=10/0;
	}
    @Test(dependsOnMethods="login")
    public void Logout(){
    	
    	System.out.println("logout successfully");
    }


}
