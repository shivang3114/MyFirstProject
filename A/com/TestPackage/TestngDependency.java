package com.TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDependency {

	// we can use "dependsOnMethods" keyword to create dependency in the project")
	
	
	@Test
	public void startapp(){
		
		Assert.assertEquals(12,01);
		
		System.out.println(" enter the url");
		
		
	}
	
	@Test(dependsOnMethods="startapp")
	public void login(){
		
		System.out.println("login credientials");
		
	}
	
	// we can define multiple dependency also
	
	
	@Test(dependsOnMethods={"startapp","login"})
	public void logout(){
		
		
		System.out.println("logout successfully");
		
	}
	
	
}
