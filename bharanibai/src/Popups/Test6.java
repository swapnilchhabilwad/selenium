package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test6 {

	public static void main(String[] args) {
		
		
		
		
		/*
		 * ChromeOptions option=new ChromeOptions();
		 * option.addArguments("--disable notification"); WebDriver driver=new
		 * ChromeDriver(option); driver.manage().window().maximize();
		 * driver.get("https://www.olx.in/en-in");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 */
		 
		
		
		
		
		  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\91960\\Downloads\\Selenium Supportive Files\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		  FirefoxOptions option=new FirefoxOptions();
		  option.addArguments("--disable notification"); WebDriver driver=new
		  FirefoxDriver(option); driver.manage().window().maximize();
		  driver.get("https://www.olx.in/en-in");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
