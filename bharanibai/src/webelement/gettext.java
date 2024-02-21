package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		String s = ele.getText();
		System.out.println(s);
		//System.out.println(ele.getText());
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
