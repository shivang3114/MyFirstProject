package set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://jqueryui.com/droppable/");
	    Thread.sleep(4000);
	    driver.manage().window().maximize();
	    //dynamic time
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.switchTo().frame(0);
	    //to perform drag and drop create action 
	    Actions action=new Actions(driver);
	    Thread.sleep(3000);
	   action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']/p")))
	   .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
	   .release()
	   .build().perform();

	}

}
