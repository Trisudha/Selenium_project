package AllSeleniumtopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handledynamicsearch {

	public static void main(String[] args) throws InterruptedException 

	{
		{
			System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("maheshbabu");
			List<WebElement> ls = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
			Thread.sleep(4000);
			for(int i=0;i<ls.size();i++)
			{
				System.out.println(ls.get(i).getText());
				Thread.sleep(4000);
				if(ls.get(i).getText().contains("mahesh babu age"))
				{
					ls.get(i).click();
					break;
				}
			}

	}

	}
}
