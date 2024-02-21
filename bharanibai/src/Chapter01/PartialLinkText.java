package Chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("identify_email")).sendKeys("9876543210");
		driver.findElement(By.id("did_submit")).click();
		*/
		
		// open the browser
		// go to https://demoapp.skillrary.com/login.php?type=login
		// click on forgotten password
		// click on return to login page ==== use partial link text
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Return")).click();
		
		
		
		
		
		

	}

}
