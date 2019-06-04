package AllSeleniumtopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlebootstrapdropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://spicejet.com");
		//bootstrapdown = with select tag for the dropdown menu options
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	     driver.findElement(By.xpath("//span[@class='pax-add pax-enabled']")).click();
	     driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
	     driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

	}

}
