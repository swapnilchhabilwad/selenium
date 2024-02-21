package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleselect {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("cars"));
		Select s=new Select(dd);
		s.selectByIndex(0);
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		Thread.sleep(3000);
		s.deselectByIndex(0);
		s.deselectByValue("saab");
		s.deselectByVisibleText("Audi");
		
		// how to check whether it is single select or multiselect
		// use isMultilple() method to check it is multi select option or not.
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()) 
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("it is not multiple select option");
		}	
		
		List<WebElement> allopt = s.getOptions();
		System.out.println(allopt.size());
		for(WebElement b:allopt)
		{
			System.out.println(b.getText());
		}
			
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
