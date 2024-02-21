package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement version = driver.findElement(By.xpath("//a[text()='4.16.1']"));
		
		  Point loc = version.getLocation(); 
		  int X=loc.getX(); 
		  int Y=loc.getY();
			/*
			 * JavascriptExecutor js= (JavascriptExecutor) driver;
			 * //js.executeScript("window.scrollBy("+X+","+Y+")");
			 * js.executeScript("window.scrollBy("+X+","+Y+")"); Thread.sleep(2000);
			 */
		  System.out.println(X+" is the x co-ordinates of the element ");
		  System.out.println(Y+" is the y co-ordinates of the element ");
		 
		  version.click();
		
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyPress(KeyEvent.VK_ENTER);
		  
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
