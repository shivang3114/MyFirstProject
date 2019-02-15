package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFlipkart {
	
     WebDriver driver;
	
	@BeforeTest
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@Test
	public void TestLogin() throws InterruptedException {
	
		Thread.sleep(4000);
		
	}
	@AfterTest()
	public void TearDown() {
		
	driver.close();	
	}
	
	
}
