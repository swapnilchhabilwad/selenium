package Chapter01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.facebook.com/login/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		 * driver.findElement(By.cssSelector("input[type='password']")).sendKeys(
		 * "manager"); driver.findElement(By.id("loginbutton")).click();
		 */
		
		
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.facebook.com/login/");
		 * 
		 * driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		 * driver.findElement(By.cssSelector("input[type='password']")).sendKeys(
		 * "manager"); driver.findElement(By.id("loginbutton")).click();
		 */
		
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://demoapp.skillrary.com/login.php?type=login");
		 * 
		 * driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
		 * driver.findElement(By.cssSelector("input[id=password]")).sendKeys("password")
		 * ; //driver.findElement(By.cssSelector("button[class=login_Btn]")).click();
		 * driver.findElement(By.cssSelector(".login_Btn")).click();
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[name='login']")).click();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
