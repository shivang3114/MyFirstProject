package revision;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPath {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		System.out.println("url of the page is"   +driver.getCurrentUrl()  + "title of the page is" +driver.getTitle() +"hashcode of the page is" +driver.hashCode());
		
		
		//enter input on google search page
		
	driver.findElement(By.name("q")).sendKeys("alan walker");
	Thread.sleep(3000);
	
	   List<WebElement>  list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
	   
	   System.out.println(list.size());
	   
	   for(int i=0; i<=list.size();  i++)
	   {
		   Thread.sleep(3000);
		   System.out.println(list.get(i).getText());
		   if(list.get(i).getText().contains("alan walker alone")){
			   
			   list.get(i).click();
			   System.out.println(list.get(i).getText());
			  // driver.quit();
		   }
	   }	
	   
	  
	
	
		
		

	}

}
