package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbarflipkart {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mast = driver.findElement(By.xpath("(//div[normalize-space()='Ketch, Mast & Harbour..']"));
		Point loc = mast.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		mast.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
