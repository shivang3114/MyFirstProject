package set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
	//HTML UNIT DRIVER is not available in selenium 3.x.versions and above version earlier it was a part of slenium.
     //htmlunitdriver----to use this concept we have to downlaod html unit driver jar file.
	//need to import in eclipse and configure in project with the help of build path
	
		//Advantages
		//1.testing is happening behind the scene---no browser.
		//2.its very fast--execution of test cases very fast---performance of the script.
		
		//disadvantage
		//1.not suitable for Action class---user actions---mousemovement,doubleclick,drag and drop
		//2.GHOST DRIVER,headless browser;
		         //htmlunit driver---java
		         //--PhantomJS---javascript.
		
		WebDriver driver=new HtmlUnitDriver();
		
	    driver.get("https://www.freecrm.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    
	    System.out.println("before login title of the page: "+driver.getTitle());
	    
	    WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
	    username.sendKeys("shivpath");
	    
	    WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
	    pwd.sendKeys("Metnet1993#");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Login' and @class='btn btn-small']")).click();
	    
	    Thread.sleep(5000);
	    System.out.println("after login title is:   "+driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.quit();
	}

}
