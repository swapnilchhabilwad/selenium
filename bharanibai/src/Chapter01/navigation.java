package Chapter01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		//navigate
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/login/");
		
		//back
		Thread.sleep(3000);
		driver.navigate().back();
		
		//forward
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//refresh
		Thread.sleep(3000);
		driver.navigate().refresh();		

	}

}
