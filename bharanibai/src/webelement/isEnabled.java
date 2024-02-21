package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		if(button.isEnabled()) 
		{		
     		System.out.println("Pass: Element is enabled");
		}
		else
		{
			System.out.println("Fail: Element is not enabled");
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
