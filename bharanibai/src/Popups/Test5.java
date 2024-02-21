package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> child = driver.getWindowHandles();
		
		//System.out.println(child);
		
		Thread.sleep(2000);
		for(String b:child) {  driver.switchTo().window(b); }
		 
		
		//driver.switchTo().window(b);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_action_request\"]")).click();
		
		
		driver.quit();
		
		
		//driver.findElement(By.xpath("(//a[@class='ignorelink'])[16]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
