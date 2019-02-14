package set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.goindigo.in/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    String URL=driver.getCurrentUrl();
    System.out.println(URL);
	
   driver.findElement(By.xpath("//input[@name='tripTabs' and @id='oneWayTrip']")).click();
    
   //to handle dropdown
   //create object of select class
   Select select= new Select(driver.findElement(By.xpath("//input[@name='or-src']")));
   //by  using this object we can call
   select.selectByIndex(2);
    
    
    driver.quit();
	}

}
