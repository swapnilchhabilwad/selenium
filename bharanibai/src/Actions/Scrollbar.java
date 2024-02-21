package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		  Thread.sleep(3000); 
		  js.executeScript("window.scrollBy(0,6000)");
		  Thread.sleep(3000); 
		  js.executeScript("window.scrollBy(0,-6000)");
		 
		
		/*
		 * WebElement topstyles = driver.findElement(By.
		 * xpath("(//body[contains(@class,'a-aui_72554-c a-aui_a11y_')]")); Point loc =
		 * topstyles.getLocation(); int X = loc.getX(); int Y = loc.getY();
		 * js.executeScript("window.scrollBy("+X+","+Y+")"); Thread.sleep(3000);
		 * topstyles.click();
		 */
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
