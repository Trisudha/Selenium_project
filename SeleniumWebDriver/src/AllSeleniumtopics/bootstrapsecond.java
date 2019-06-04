package AllSeleniumtopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapsecond {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Dropdown button')]")).click();
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));
		System.out.println(ls.size());
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i).getText());
			if(ls.get(i).getText().equals("Another action"))
			{
				ls.get(i).click();
				break;
				
			}
		}
	}

}
