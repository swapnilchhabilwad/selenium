package Chapter01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) {
		
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.amazon.com/");
          System.out.println(driver.getTitle());
          System.out.println(driver.getCurrentUrl());
          driver.close();
          
	}

}
