package set;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //driver.get("https://www.goindigo.in/");
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		
		
	    driver.findElement(By.name("q")).sendKeys("testing");
	    
	    Thread.sleep(3000);
	 
	    //to pick suggestions below xpath pick all the suggestions
	    
	    List <WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
	    
	    System.out.println("total number of suggestions"   +list.size());
	    
	    for(int i=0; i<list.size(); i++){
	    	
	    	System.out.println(list.get(i).getText());
	    	
	    	
	    	
	    if(list.get(i).getText().contains("testing types")){
	    	
	    	
	    	list.get(i).click();
	    	Thread.sleep(3000);
	    	break;
	    	}
	    Thread.sleep(2000);
	    driver.navigate().back();
	    
	    Thread.sleep(3000);
	    	
	    	driver.close();
	    	
	    }
	    
	    
	}

}
