package set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
	    
	    driver.get("https://www.goindigo.in/");
	    
	    

	}

	//create a new class
	public static void clickOn(WebDriver driver,String locator, int timeunit)
	{
		//new WebDriverWait(driver, timeunit).ignoring(StateElementRefrenceException.)
		
		//NOT CLEAR SEE SOMEOTHER OPTION
	} 
	
}
