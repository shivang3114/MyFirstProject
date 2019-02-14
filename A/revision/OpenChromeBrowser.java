package revision;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenChromeBrowser {
     WebDriver driver;
	@Test
	public void Browser(){
		
			System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get("https://www.freecrm.com");	
	}
	
		
			
	
	
}
