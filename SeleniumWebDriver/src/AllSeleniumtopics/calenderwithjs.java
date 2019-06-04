package AllSeleniumtopics;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calenderwithjs {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://www.spicejet.com/");

		
	WebElement we = driver.findElement(By.id("ctl00_mainContent_view_date1"));
	String datval = "17-05-2019";
	
	Thread.sleep(2000);
	calenWithJS(driver,we,datval);
		}	
	public static void calenWithJS(WebDriver driver,WebElement element, String datval)
	{
		System.out.println("hjdjh");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+datval+"');",element);
	}

}
