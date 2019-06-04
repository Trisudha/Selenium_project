package AllSeleniumtopics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlebrowserpopup {

	public static void main(String[] args)
	
	{
	System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("http://www.popuptest.com/");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[12]/b/a")).click();
	
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		
		String parentwin = it.next();
		System.out.println(parentwin);
		
		String childwin = it.next();
		System.out.println(childwin);
		
		driver.switchTo().window(childwin);
	
		System.out.println("child win title is : "+ driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwin);
		System.out.println("parent win title is : "+ driver.getTitle());
		
		
		
		

	}

}
