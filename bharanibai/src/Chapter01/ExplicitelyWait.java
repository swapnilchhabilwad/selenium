package Chapter01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitelyWait {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("username"));
		//username.sendKeys("admin");
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("password"));
		//password.sendKeys("password");
	    wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("password");
		
		//Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//div[contains(@class,'x9f619 xjbqb8w x78zum5 x168nmei')][3]"));
		//button.click();
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		String acttitle = driver.getTitle();
		wait.until(ExpectedConditions.titleContains("Instagram"));
		//System.out.println(acttitle);
		
		String url = driver.getCurrentUrl();
		wait.until(ExpectedConditions.titleContains("url"));
		//System.out.println("");
		
		if(acttitle.equals("Instagram"))
		{
			System.out.println("Pass:- Home page is displayed");
		}
		else
		{
			System.out.println("Fail:- Home page is not displayed");
		}
		
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		 
	}
	
}
	


