package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownamazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.id("searchDropdownBox"));
		Select s= new Select(search);
		s.selectByIndex(10);
		Thread.sleep(3000);
		s.selectByValue("search-alias=amazon-pharmacy");
		Thread.sleep(3000);
		s.selectByVisibleText("Car & Motorbike");
		
		
		List<WebElement> allopt = s.getOptions();
		System.out.println(allopt.size());
		
		for(WebElement b:allopt)
		{
			System.out.println(b.getText());
		}
		}
				

	}


