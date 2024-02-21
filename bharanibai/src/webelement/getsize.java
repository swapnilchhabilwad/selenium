package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		Dimension size = search.getSize();
		int h = size.getHeight();
		System.out.println("Height of the search box is = "+h);
		
		int w = size.getWidth();
		System.out.println("Width of the search box is = "+w);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
