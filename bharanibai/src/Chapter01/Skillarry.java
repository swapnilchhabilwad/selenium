package Chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillarry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		driver.findElement(By.id("email")).sendKeys("Vinaykumar09064@gmail.com") ;
		driver.findElement(By.id("password")).sendKeys("123456789");
		
		Thread.sleep(3000);
		driver.findElement(By.id("last")).click();
		
		
	}

}
