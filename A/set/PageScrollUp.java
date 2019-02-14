package set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageScrollUp {

	
	
	@Test
	public void ScrollUp() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.freecrm.com/");
	    Thread.sleep(4000);
	    driver.manage().window().maximize();
	    //dynamic time
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    Thread.sleep(5000);
	    
	    
	 // This  will scroll page 600 pixel vertical
	    ((JavascriptExecutor)driver).executeScript("scroll(500,1000)");
	    
	    Thread.sleep(5000);
		
		driver.quit();
		
	}
	
	
}
