package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("mobiles");
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("mobiles");
	//	driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("mobiles");
		//driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]")).sendKeys("mobiles");

		//driver.findElement(By.xpath("//input[ends-with(@id,'gh-ac')]")).sendKeys("mobiles");
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.linkText("Fashion")).click();
	}

}
