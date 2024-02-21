package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {

	public static void main(String[] args) {
		
		
		//Facebook Email
		
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		Point loc = email.getLocation();
		int X = loc.getX();
		System.out.println("X Coordinate is = "+X);
		
		int Y = loc.getY();
		System.out.println("Y Coordinate is = "+Y);
		
		driver.close();*/
		
		
		// Amazon Search button
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	    WebElement button = driver.findElement(By.id("nav-search-submit-button"));
	    
	    Point loc = button.getLocation();
	    int X = loc.getX();
	    System.out.println("X coordinate is equal to "+X);
	    
	    int Y=loc.getY();
		System.out.println("Y coordinate is equal to "+Y);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
