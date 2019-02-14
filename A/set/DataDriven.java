package set;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DataDriven {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C://Users//shivpath//workspace//A//set//configure.properties");
		
		prop.load(fis);
		
		String url1=prop.getProperty("url");
		System.out.println(url1);
		System.out.println(prop.getProperty("age"));
		
		//USERNAME
		//String user=prop.getProperty("username");
		//System.out.println(user);
		
		//PASSWORD
		//String password=prop.getProperty("pwd");
		//System.out.println(password);
		
		//username_xpath
		//String userPath=prop.getProperty("xpath_username");
		//System.out.println(userPath);
		
		if(url1.equals("https://www.freecrm.com/"))
		{
		System.out.println("browser opened successfully");	
		
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		}
		else{
			System.out.println("test case failed");
		}
		
		driver.get(url1);
		driver.findElement(By.xpath(prop.getProperty("xpath_username"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("xpath_pwd"))).sendKeys(prop.getProperty("password"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("xpath_click_button"))).click();
		
		
		System.out.println(driver.getTitle());
		
		
		//driver.findElement(By.xpath(prop.getProperty("xpath_upgradeyourLink"))).click();
		
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		
		Thread.sleep(4000);
		
		action.moveToElement(driver.findElement(By.xpath(prop.getProperty("xpath_mouseMovement_HOME")))).build().perform();;
		
		driver.quit();
		
		}
	}


