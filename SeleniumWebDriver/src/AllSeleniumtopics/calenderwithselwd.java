package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class calenderwithselwd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://www.spicejet.com/");
		Actions act = new Actions(driver);
		WebElement el = driver.findElement(By.id("highlight-addons"));
		act.moveToElement(el).build().perform();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Hyderabad");
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Delhi");
		String date = "15-April-2019";
		String date1[] = date.split("-");
		String day =date1[0];
		String month = date1[1];
		String year = date1[2];
		
		WebElement strtdate= driver.findElement(By.id("ctl00_mainContent_view_date1"));
		Select ss = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/span[1]")));
		ss.selectByVisibleText(month);
		Select ss1 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/span[1]")));
		ss1.selectByVisibleText(year);
		Select ss2 = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/span[1]")));
		ss2.selectByVisibleText(day);
///html/body/div[2]/div[1]/table/tbody/tr[3]/td[1]/span
///html/body/div[2]/div[1]/table/tbody/tr[3]/td[5]/a
		
		String beforexpath = "/html/body/div[2]/div[1]/table/tbody/tr[";
		String afterxpath = "]/td[";
		final int noofdays = 7;
		for(int rowno=1;rowno<=7;rowno++)
		{
			for(int colno=1;colno<noofdays;colno++)
			{
				String datval= driver.findElement(By.xpath("beforexpath+rowno+afterxpath+colno+"+"]")).getText();
				System.out.println(datval);
		}
	}

	}
}
