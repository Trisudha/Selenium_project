package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headlesstest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.popuptest.com/");
		System.out.println(driver.getTitle());
		WebElement s = driver.findElement(By.tagName("a"));
		System.out.println(s.getSize());
		
		

	}

}
