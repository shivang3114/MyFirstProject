package set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    //driver.get("https://www.goindigo.in/");
	    driver.get("https://www.freecrm.com/register/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	   //isDisplayed() method:applicable for all the elements 
	    //it will return true if it is diplyed or else return false.
	    
	//driver.findElement(By.xpath("//a[text()='Check-in']")).click();
	
	Thread.sleep(4000);
	
    //boolean bl=driver.findElement(By.xpath("//button[@class='btn btn-primary block bold ig-search-btn checkin-btn-click']")).isDisplayed();
	//System.out.println(bl);
		
		//driver.quit();
		
	//2.isEnabled()	method
		
	boolean b2=driver.findElement(By.id("submitButton")).isEnabled();	
	System.out.println(b2);
	
	//select I agree check box button will be enabled and output will come as true.
	 
		driver.findElement(By.name("agreeTerms")).click();  //select the check box
		boolean b3=driver.findElement(By.id("submitButton")).isEnabled();	//button is enable now
		System.out.println(b3);
		
	//isSelected() method is only applicable for checkbox, dropdown,  radiobutton.
		
		boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);
		
		
	//de-select the checkbox
		driver.findElement(By.name("agreeTerms")).click();    //again i will click
		Thread.sleep(4000);
		boolean b5=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5);
		
		//driver.quit();
		
		
		
	}

}
