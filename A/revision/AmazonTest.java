package revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {

	WebDriver driver;
	@BeforeMethod
		public void SetUp() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
	
	}
	
	
	
	@Test
	public void Testaction() throws InterruptedException{
		
		
		
		Actions action3= new Actions(driver);
		action3.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1]"))).build().perform();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id='nav-al-wishlist']/a[1]/span")).click();
		
		Thread.sleep(5000);
		
        boolean b=driver.findElement(By.xpath("//*[@id='nav-subnav']/a[6]/span")).isDisplayed();
        System.out.println("is link displyed" +b);
        boolean b1=driver.findElement(By.xpath("//*[@id='nav-subnav']/a[6]/span")).isEnabled();
        System.out.println("is link enabled"+b1);
        driver.findElement(By.xpath("//*[@id='nav-subnav']/a[6]/span")).click();
        boolean b2=driver.findElement(By.xpath("//*[@id='nav-subnav']/a[6]/span")).isSelected();
        Thread.sleep(5000);
        System.out.println("is link selected "+b2);
        
        driver.switchTo().frame("DAsis");
        
        driver.findElement(By.xpath("//*[@id='leftNav_405512']/div[4]/button")).click();
        
        Thread.sleep(5000);
        
		/*WebElement  w1= driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(w1).build().perform();
		
		WebElement  ww= driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]"));
		Actions action2=new Actions(driver);
		action.moveToElement(ww).build().perform();
		ww.click();*/
		
		
		
		
		//Thread.sleep(4000);
	}
	/*Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C://Users//shivpath//workspace//A//revision//configure.properties");
	 prop.load(fis);
	
	  prop.getProperty("URL");
	   Thread.sleep(5000);*/
	
	@Test(enabled=false)
	public void Links(){
		
		
	List<WebElement> link=driver.findElements(By.tagName("a"));
	 System.out.println(link.size());
	 
	 
	 List<WebElement> image=driver.findElements(By.tagName("i"));
	 System.out.println(image.size());
	
	}
	@Test(enabled=false)
	public void A() throws InterruptedException{
		
	//Actions action=new Actions(driver);
	//action.moveToElement(driver.findElement(By.xpath("//a[text()='Your Amazon.com']"))).build().perform();
	driver.findElement(By.xpath("//a[text()='Your Amazon.com']")).click();	
	driver.navigate().back();
		Thread.sleep(3000);
	//action.click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
	driver.navigate().back();
	driver.findElement(By.xpath("//a[text()='Registry']")).click();
	Thread.sleep(4000);
	driver.navigate().back();
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(4000);
	System.out.println(driver.getTitle());
	driver.navigate().back();
	System.out.println(driver.getTitle());
	Thread.sleep(4000);
	
	}
	
	@AfterMethod(enabled=false)
	public void TearUp(){
		
		driver.close();
	}
	
}
