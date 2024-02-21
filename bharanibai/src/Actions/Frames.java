package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='accountInner']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='col-xs-24']")).sendKeys("8087984568");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("phone");
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
