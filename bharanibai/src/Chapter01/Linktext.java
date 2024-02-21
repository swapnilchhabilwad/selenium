package Chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("identify_email")).sendKeys("Vinaykumar09064@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("did_submit")).click();
		
		
		
		
		

	}

}
