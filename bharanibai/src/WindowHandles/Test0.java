package WindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://skillrary.com/");
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[@class='ignorelink'])[11]")).click();
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		driver.findElement(By.id("mytext")).sendKeys("This is the practice of shifting controls from one tab to another. ");
		Thread.sleep(5000);
		driver.close();
		//driver.close();
		
		
		
		
		
		
		Actions a=new Actions(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
