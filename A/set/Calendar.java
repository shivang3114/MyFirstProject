package set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.goindigo.in/");
	    Thread.sleep(4000);
	    driver.manage().window().maximize();
	    //dynamic time
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    //login
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shivpath");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Metnet1993#");
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Login' and @class='btn btn-small']")).click();
	    
	    
	    //driver.switchTo().frame("0");
	    //driver.switchTo().frame("mainpanel");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@name='or-depart' and @class='form-control or-depart igInitCalendar' ]")).click();
	    
	    /*     String date= "14-Feb-2019";
	    
	    String dateArray[]=date.split("--");  //14,November,2018
	    
	    String day=dateArray[0]; 
	    String month=dateArray[1];
	    String year=dateArray[2];
	    
	    
	    
	    
	/*    Select select=new Select(driver.findElement(By.xpath("//select[@name='slctMonth']")));
	    select.selectByVisibleText(month);
	    
	    Thread.sleep(3000);
	    
	    Select select1=new Select(driver.findElement(By.xpath("//select[@name='slctYear']")));
	    select1.selectByVisibleText(year);
	    
	    Thread.sleep(2000);  */
	    
	    
	    
	   
	   
	    
	    
	    
	    
	    
		
	}

}
