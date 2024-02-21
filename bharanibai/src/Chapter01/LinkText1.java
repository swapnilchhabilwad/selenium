package Chapter01;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("vinay@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("l@cg$194656");
		Thread.sleep(3000);
		driver.findElement(By.id("last")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
