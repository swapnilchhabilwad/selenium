package Chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("Vinaykumar09064@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456789");
		driver.findElement(By.id("loginbutton")).click();
		
		
		
		
		
		
		
		

	}

}
