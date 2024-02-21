package Chapter01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowManagement {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		
		//maximize
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//full screen
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
		//minimize
		Thread.sleep(3000);
		driver.manage().window().minimize();
		

	}

}
