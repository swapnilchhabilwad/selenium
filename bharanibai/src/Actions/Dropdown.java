package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
		Thread.sleep(3000);
        //deselectByIndex(0);
		//s.selectByValue("2984");
		//s.selectByVisibleText("Business & Industrial");
		
		
		// I want to get count of all options and text of all options
		
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		
		// I want to print the text of all options
		for(WebElement b:alloptions) 
		{
			System.out.println(b.getText());
		}
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
