package Chapter01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveTest {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.get("https://www.google.com/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * // WebElement ele =(WebElement) driver.findElement(By.id("APjFqb"));
		 * WebElement ele = driver.findElement(By.id("APjFqb")); ele.sendKeys("Phone");
		 * Thread.sleep(3000); ele.clear(); driver.close();
		 */
		
		/*
		 * driver.get("https://www.amazon.in/"); driver.manage().window().maximize();
		 * 
		 * WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		 * search.sendKeys("iphone"); Thread.sleep(3000);
		 * driver.findElement(By.id("nav-search-submit-button")).submit();
		 */
		
		/*
		 * driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		 * //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * Thread.sleep(3000); WebElement user = driver.findElement(By.id("username"));
		 * user.clear(); WebElement password = driver.findElement(By.id("password"));
		 * password.clear(); WebElement button =
		 * driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		 * button.submit();
		 */
		
		driver.get("https://www.facebook.com/");
		//WebElement text = driver.findElement(By.xpath("//h3[text()='Enter Time-Track for']"));
		WebElement text = driver.findElement(By.id("headerContainer"));
		text.getText();
		System.out.println(text.getTagName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
