package Chapter01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaVerification {

	public static void main(String[] args) throws InterruptedException {

    	/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");

		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//div[contains(@class,'x9f619 xjbqb8w x78zum5')][3]")).click();

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String acttitle = driver.getTitle();
		System.out.println(acttitle);

		driver.close();

		if (acttitle.equals("Instgram")) {
			System.out.println("Pass: Home page is displayed");
		} else {
			System.out.println("Fail: Home page is not displayed");
		}

		System.out.println("Title of the page:-" + acttitle);
		System.out.println("URL of the page:-" + url);
		*/
		  
		  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		  driver.get("https://www.instagram.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  WebElement username = driver.findElement(By.name("username"));
		  username.sendKeys("admin");
		  //driver.findElement(By.xpath("(//*[@class='_aa4b _add6 _ac4d _ap35'])[1]")).sendKeys("admin");
		  //driver.findElement(By.xpath("(//*[@class='_aa4b _add6 _ac4d _ap35'])[2]")).sendKeys("passeword");
		  //driver.findElement(By.xpath("(//*[@class='_aa4b _add6 _ac4d _ap35'])[2]")).sendKeys("password"); 
		  WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		  pwd.sendKeys("password"); 
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath("//div[contains(@class,'x9f619 xjbqb8w x78zum5')][3]")).click();
		  System.out.println("Title of the page :- "+ driver.getTitle());
		  System.out.println("URL of the page:-"+ driver.getCurrentUrl());
		  //System.out.println("URL of current page :-"driver.getCurrentUrl());
		  driver.close();
		  
		  
		 

	}

}
