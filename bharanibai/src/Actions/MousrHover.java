package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousrHover {

	public static void main(String[] args) {
		
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.ebay.com/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * WebElement electronics =
		 * driver.findElement(By.xpath("(//a[text()='Electronics'])[2]")); Actions a=new
		 * Actions(driver); a.moveToElement(electronics).perform();
		 */
		
		//Assignment 1
		
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.myntra.com/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * WebElement men =
		 * driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]")); Actions
		 * a=new Actions(driver); a.moveToElement(men).perform();
		 */
		
		//Assignment 2
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Health & Beauty'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(Beauty).perform();
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
