package com.TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GoogleTest {
//first i will intialize everyclass
//everytime it will run @before,@test and @after 
	WebDriver driver;
	
	//1  //4   //7
	@BeforeMethod
	public void SetUP(){
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.get("http://www.google.com");
	     
	     
	}
	//2
	@Test(priority=1,groups="login")
	public void GoogleTest(){
		
		String title=driver.getTitle();
		System.out.println(title);
		
	
		}
	 //5
	
	@Test(priority=2,groups="login")
	public void verifyImage(){
		
		boolean display=driver.findElement(By.id("hplogoo")).isDisplayed();
		
		System.out.println(display);
		Assert.assertTrue(display);
		}
	//8
	
	@Test(priority=3,groups="logout")
	public void MailLinkText(){
		
          boolean linkDisplay=driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
        System.out.println("linkDisplay");	
	}
	
	@Test(priority=4,groups="no data")
	public void test1(){
		
		
	}
	
	@Test(priority=5,groups="logout")
	public void test2(){
		
		
	}
	
	@Test(priority=6,groups="no data")
	public void test3(){
		
		
	}
	//3  //6   //9
	
	@AfterMethod
	public void tearDown()   //these are standard class name e.g teardown and setup
	{     
		
		driver.quit();
	}
	
	
	
	
}
