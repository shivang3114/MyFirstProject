package set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.goindigo.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    String URL=driver.getCurrentUrl();
	    System.out.println(URL);
	    System.out.println("i HAVE REACHED");
	    
	    Alert alert= driver.switchTo().alert();
	    
	    System.out.println(alert.getText());
	    Thread.sleep(4000);
	    
	    alert.dismiss();
	    //driver.quit();
	    
	    Alert alert1=driver.switchTo().alert();
	    
	}

}
