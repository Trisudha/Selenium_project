package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingirritaingchat {

	public static void main(String[] args) {
		// 
		
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page");
		driver.switchTo().frame("");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/svg"))).build().perform();
		act.click();
		

	}

}
