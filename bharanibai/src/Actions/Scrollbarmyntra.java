package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbarmyntra {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.myntra.com/");
		driver.get("https://github.com/bharanilikith/selenium7");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//WebElement ele = driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[39]"));
		WebElement ele = driver.findElement(By.xpath("(//a[@class='Link--secondary Link'])[1]"));
		Point loc = ele.getLocation();
		int X =loc.getX();
		int Y =loc.getY();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+X+","+Y+")");
		
		Thread.sleep(3000);
		ele.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
