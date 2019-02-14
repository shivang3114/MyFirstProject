package set;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.freecrm.com/");
	    Thread.sleep(4000);
	    driver.manage().window().maximize();
	    //dynamic time
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    //login
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shivpath");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Metnet1993#");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Login' and @class='btn btn-small']")).click();
	    
	    
	    driver.switchTo().frame("mainpanel");
	    
	    //links---//<a>href  property----e.g. we are on google site but developer has mentioned href(www.google123.com) so how to test this href.
	    //images--//<img>href property---after click on image might b will move to other url.
	    
	    //how to check
	    //1.get the list of all links
	    List<WebElement> linkList=driver.findElements(By.tagName("a"));
	    linkList.addAll(driver.findElements(By.tagName("img")));
	    
	    //if href is not available in links so we have not considered that is out of scope for us.
	       
	   List<WebElement> activelinks=new ArrayList<WebElement>(); 
	    
	     //2.Iterate linksList:

	    
	    
	    
	}

}
