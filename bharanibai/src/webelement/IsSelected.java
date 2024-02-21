package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cac = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		cac.click();
		WebElement button = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
		if(button.isSelected()) {
			System.out.println("Pass: Element is selected");
		}
		else
		{
			System.out.println("Fail: Element is not Selected");
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
