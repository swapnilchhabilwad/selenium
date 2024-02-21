package Chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input")).sendKeys("admin");
		driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(2) > div > label > input")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
