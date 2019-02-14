package set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    //dynamic wait
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//this will
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
