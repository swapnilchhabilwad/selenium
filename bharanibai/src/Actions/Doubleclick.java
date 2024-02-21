package Actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("add"));
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		
		
		Thread.sleep(2000);
		driver.navigate().to("https://omayo.blogspot.com/");
		WebElement dbl = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		Point loc = dbl.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(2000);
		a.doubleClick(dbl).perform();
		
		
		Alert b = driver.switchTo().alert();
		System.out.println(b.getText());
		Thread.sleep(2000);
		b.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
