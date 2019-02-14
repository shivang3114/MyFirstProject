package set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    
	    //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
	    
	    //driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("JAVA");
	    
	                  //contains
	    //driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]")).sendKeys("java");
	    
	  //dynamic id;-----it is not constant
	     //id=test_123
	    //id=test_456
	    //id=test_789

	                 //one more starts-with
	    driver.findElement(By.xpath("//input[starts-with(@class,'gLFyf gsfi')]")).sendKeys("java");
	    
	    //id=1234_test_t
	    //id=23456_test_t
	    //id=43256_test_t
	                             //ends-with
	    driver.findElement(By.xpath("//input[ends-with(@class,'gLFyf gsfi')]")).sendKeys("java");
	    
	    //a[contains(text(),'my account')]
	    
	    //a[text()='my account']
	    
	    Thread.sleep(4000);
	    driver.close();

	}

}
