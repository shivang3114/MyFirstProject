package set;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.goindigo.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    
	    //get the count of links on the page
	    //get the test of each link on the page
	    
	    List<WebElement> linkList=driver.findElements(By.tagName("a"));
	    //List<WebElement> linkList1=driver.findElements(By.tagName("input"));
	    //List<WebElement> linkList2=driver.findElements(By.tagName("button"));
           
           //size of linklist
           System.out.println("number of links is=" +linkList.size());
           
           //get the test of each link on the page
     
           for(int i=0; i<linkList.size(); i++){
        	   
        	   String linkText=linkList.get(i).getText();
        	   System.out.println(linkText);
           }
           
	}
	
	

}
