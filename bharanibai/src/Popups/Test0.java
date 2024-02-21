package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		
		 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.id("user_full_name")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("user_email_login")).sendKeys("abc@ubuy.com");
		Thread.sleep(2000);
		driver.findElement(By.id("user_password")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.id("user_submit")).click();
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert(); 
	    System.out.println(a.getText());
		a.accept(); 
	    //a.dismiss();
		 
		
		//driver.findElement(By.xpath("//a[text()='Close']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
