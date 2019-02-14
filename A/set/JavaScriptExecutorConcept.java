package set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.freecrm.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    
	    WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	    username.sendKeys("shivpath");
	    
	    WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
	    pwd.sendKeys("Metnet1993#");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Login' and @class='btn btn-small']")).click();
	    

	}

}
