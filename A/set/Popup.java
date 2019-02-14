package set;

import java.util.Iterator;
import java.util.Set;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\data backup\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.popuptest.com/goodpopups.html");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    String URL=driver.getCurrentUrl();
	    System.out.println(URL);
	    //click on first link with below path
	    driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
	    
	    //1.alerts---JavaScript Popup---Alert API(accepe,dismiss)
	    //2.File Upload popup---Browse button(type=file,sendKeys(path)
	    //3.bBrowser window popup--(windowHandler API-getWindowHandles() )
	    
	    
	   
	    //we have two windows parent and child window
	    Set<String> handler=driver.getWindowHandles();
	    Iterator<String> it=handler.iterator();
	    
	    //it will select the window
	    String parentWindow=it.next();
	    System.out.println("this is parent window ID" +parentWindow);
	    
	    //now again use next so it will go to next window
	    String childWindow=it.next();
	    System.out.println("this is child window" +childWindow);
	    Thread.sleep(4000);
	    
	    //now moves to other window 
	    driver.switchTo().window(childWindow);
	    //now control moves to child window
	    Thread.sleep(4000);
	    
	    System.out.println("child window pop up title" +driver.getTitle());
	    driver.close();  //it close the child window.
	    //now control lost again get back to parent window control
	    Thread.sleep(4000);
	    
	    driver.switchTo().window(parentWindow);
	    System.out.println("this is parent window" +driver.getTitle());
	    
	    //now try to another link with same 
	    driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #2')]")).click();
	    Thread.sleep(3000);
	    
	    Set<String> handler1=driver.getWindowHandles();
	    /*Iterator<String> it1=handler1.iterator();
	    String Oneson=it.next();
	    System.out.println("this is parent focus for new link" +Oneson);
	    String Secondson=it.next();
	    System.out.println("this is the 2nd chilc" +Secondson);
	    
	    driver.switchTo().window("Oneson");
	    System.out.println("one son title" +driver.getTitle());*/
	    
	    Thread.sleep(2000);
	    driver.close();
	    
	    
	}

}
