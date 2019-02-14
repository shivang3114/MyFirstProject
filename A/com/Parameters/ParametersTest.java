package com.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

	WebDriver driver;
	
	@Test
	@Parameters({"url","username","password","browser","QA"})
	public void CRMLoginTest(String QA,String browser,String url,String username,String password) throws InterruptedException{
		
		if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		}else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\data backup\\Selenium\\gecko.exe");	
			driver=new FirefoxDriver();
		}
		//driver.findElement(By.name("username")).clear();
		//username
		driver.findElement(By.name("username")).sendKeys(username);;
		//pwd
		driver.findElement(By.name("password")).sendKeys(password);
		
		Thread.sleep(4000);
	}
	
	
}
