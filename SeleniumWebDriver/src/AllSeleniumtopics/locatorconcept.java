package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorconcept {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://login.yahoo.com/");
		WebElement loginid = driver.findElement(By.xpath("//input[@id='login-username']"));
		loginid.sendKeys("trisu@yahoo.com");
		//WebElement is an interface 
		
		

	}

}
