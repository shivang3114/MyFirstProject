package set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.freecrm.com/index.html");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    //dynamic wait
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
	    /*driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[2]/a/font")).click();
	    
	    //selecting dropdown
	    Select Ddown= new Select(driver.findElement(By.xpath("//select[@name='payment_plan_id']")));
	    Ddown.selectByIndex(1);
	    Thread.sleep(4000);
	    driver.findElement(By.name("first_name")).sendKeys("Shivang");
	    driver.findElement(By.name("surname")).sendKeys("Pathak");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shivangpathak232@gmail.com");
	    driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys("shivangpathak232@gmail.com");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shivpath");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Metnet1993#");
	    driver.findElement(By.xpath("//input[@type='password' and @class='form-control input-text' and @name='passwordconfirm' ]")).sendKeys("Metnet1993#");
	    driver.findElement(By.xpath("//input[@type='checkbox' and @name='agreeTerms']")).click();
	    driver.findElement(By.xpath("//div[@class='myButton']//button[@id='submitButton']")).click();
	    Thread.sleep(4000);*/
	    
	    //how to handle frames now
	    //login first
	    driver.findElement(By.name("username")).sendKeys("shivpath");
	    driver.findElement(By.name("password")).sendKeys("Metnet1993#");
	    driver.findElement(By.xpath("//input[@class='btn btn-small' and @value='Login']")).click();
	    
	    //click on contacts link
	   driver.switchTo().frame("mainpanel");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Print']")).click();
	    Thread.sleep(4000);
	    driver.navigate().back();  
	     
	   //now we can move to left panel frame.
	    
	 /*   driver.switchTo().frame("leftpanel");
	    driver.findElement(By.xpath("//a[text()='Add Boxes»']")).click(); */
	     Thread.sleep(3000);
	     
	    //driver.quit();
        

	    
	    //driver.quit();
		
	}

}
