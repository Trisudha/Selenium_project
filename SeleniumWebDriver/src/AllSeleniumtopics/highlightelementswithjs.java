package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlightelementswithjs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://easy.techmahindra.com/");
		driver.findElement(By.xpath("//input[@name='txtLanId']")).sendKeys("bt85079");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("May@2019");
		driver.findElement(By.xpath("//input[@name='btnlogin']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		//WebElement loginbutton = driver.findElement(By.xpath("//input[@name='btnlogin']"));
		WebElement res = driver.findElement(By.xpath("//button[@type='button']"));
		Thread.sleep(2000);
		flash(res, driver);
	}
	public static void flash(WebElement element, WebDriver driver)
		{
		JavascriptExecutor js =  ((JavascriptExecutor)driver);
		String s = element.getCssValue("backgroundcolor");
		for(int i=0;i<100;i++)
		{
		changecolor("RGB(205, 92, 92)",element,driver);
		changecolor(s,element,driver);
		}
		}
	
public static void changecolor(String color, WebElement element,WebDriver driver)
{
	JavascriptExecutor js =  ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.backgroundColor= '" +color+"'" ,element);
			try {
				Thread.sleep(20);
			}
	catch(InterruptedException e)
	{
}
}
}

