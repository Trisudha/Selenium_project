package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		//driver.get("https://www.spicejet.com/");
		
		//WebElement el = driver.findElement(By.id("highlight-addons"));
		//act.moveToElement(el).build().perform();
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Hyderabad");
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Delhi");
		//driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
//
		//Drag and Drop concept
		driver.get("http://jqueryui.com/droppable/");
				driver.switchTo().frame(0);
				Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(src, dst).build().perform();
		
	}

}
