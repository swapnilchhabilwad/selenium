package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
	    Thread.sleep(2000);
	    Alert b = driver.switchTo().alert();
	    System.out.println(b.getText());
	    Thread.sleep(2000);
		b.dismiss();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		Thread.sleep(2000);
		Alert c = driver.switchTo().alert();
		System.out.println(c.getText());
		
		c.sendKeys(" swapnil is practicing ");
		Thread.sleep(4000);
		c.accept();
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
