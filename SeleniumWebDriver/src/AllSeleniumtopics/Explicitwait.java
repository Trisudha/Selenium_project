package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicitwait {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://easy.techmahindra.com/");
		driver.findElement(By.name("txtLanId")).sendKeys("bt85079");
		driver.findElement(By.name("txtPassword")).sendKeys("May@2019");
		driver.findElement(By.name("btnlogin")).click();
		

	}

}
