package Autosuggestions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.google.com/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * driver.findElement(By.name("q")).sendKeys("Seleni"); Thread.sleep(3000);
		 * List<WebElement> autosuggestion =
		 * driver.findElements(By.xpath("//li[@class='sbct PZPZlf']")); //1st
		 * autosuggestion ch xpath aahe System.out.println(autosuggestion.size());
		 * for(WebElement b:autosuggestion) { System.out.println(b.getText()); }
		 */
		
		// assignment of Myntra.com
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("dress");
		Thread.sleep(3000);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(autosuggestion.size());
		
		  for(WebElement b:autosuggestion) 
		  {
			  System.out.println(b.getText()); 
		  }
		 
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
