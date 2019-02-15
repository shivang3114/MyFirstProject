package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFunctionality {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	
    WebDriver driver= new ChromeDriver();
    //driver.get("https://www.google.com/");
    
    driver.get("https://www.facebook.com/");
    
    Select dropdown=new Select(driver.findElement(By.name("birthday_day")));

    dropdown.selectByVisibleText("14");
    Select month=new Select(driver.findElement(By.name("birthday_month")));
    
    month.selectByVisibleText("Feb");
    
    Thread.sleep(3000);
    boolean b=driver.findElement(By.name("birthday_month")).isSelected();
    
    System.out.println(b);
    
    Select year=new Select(driver.findElement(By.name("birthday_year")));
    year.selectByIndex(1);
    
    driver.findElement(By.xpath("//button[@name='websubmit']")).click();
    
    Thread.sleep(5000);
    
   
    


    
    
    
    

   System.out.println("my name is shivang");
	
	}

}
