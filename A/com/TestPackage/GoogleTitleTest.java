package com.TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class GoogleTitleTest {

	WebDriver driver;
	@BeforeMethod()
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.get("http://www.google.com");
		}
	@Test()
	public void pageTitle(){
		
		String tit=driver.getTitle();
		System.out.println(tit);
		
    Assert.assertEquals(tit, "Google");
		}
	
	@Test()
	public void gmailLink(){
	boolean linki=driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
	
	  System.out.println(linki);
	  Assert.assertEquals(linki,true);
	//Assert.assertTrue(linki);
	}
	
	
	
	@AfterMethod()
	public void tearDown(){
		driver.close();
	}
	
	
		
	
	
	
}
