package listeners.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listeners.demo.TestNGListener.class)


public class MyFirstTestCase extends TestNGListener{

	WebDriver driver;
	
	//how to connect this test case with listener class.
	 //with the help of @Listners annotation
	
	
	@Test
	
	public void GoogleTitleVerify() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.goindigo.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    String URL=driver.getCurrentUrl();
	    System.out.println(URL);
		
		
		
	}
	
	
	
}
