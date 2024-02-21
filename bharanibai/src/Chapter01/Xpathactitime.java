package Chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathactitime {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://integrator.actitime.com/auth/at");
		 * 
		 * driver.findElement(By.name("actiTimeUrl")).sendKeys("kjhertyuhj");
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/form/div[2]/input")).sendKeys(
		 * "admin"); driver.findElement(By.name("password")).sendKeys("password");
		 * //driver.findElement(By.cssSelector("button[type='submit']")).click();
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/form/button/span")).click();
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		driver.findElement(By.xpath("//a[contains(.,'LOGIN')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"last\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
