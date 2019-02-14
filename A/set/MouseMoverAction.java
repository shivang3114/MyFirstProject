package set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoverAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.hdfcbank.com/");
	    Thread.sleep(4000);
	    driver.manage().window().maximize();
	    //dynamic time
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    Actions action=new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//a[text()='Products']"))).build().perform();
	    //Thread.sleep(3000);
	    driver.findElement(By.linkText("Insurance")).click();
	    Thread.sleep(3000);
	    
	    action.moveToElement(driver.findElement(By.xpath("//a[text()='Making payments']"))).build().perform();
	    
	    //driver.findElement(By.linkText("Pay with PayZapp")).click();
	    
	    
	    
	
	}

}
