package Chapter01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='login_Btn']")).click();                //button[@class='login_Btn']
		
		
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		if(actualtitle.equals("SkillRary Ecomerce"))
		{
			System.out.println("Pass: Home Page is displayed");
		}
		else 
		{
			System.out.println("Fail: Home Page is not displayed");
		}
				
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
