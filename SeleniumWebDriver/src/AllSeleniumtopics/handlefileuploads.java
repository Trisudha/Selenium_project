package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlefileuploads {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    //driver.get("http://xndev.com/display-image/");
		driver.get("https://html.com/input-type-file/");
	    Thread.sleep(2000);
	   // driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\YS00559791\\Desktop\\Spanish_Notification_Screenshot");

	    Thread.sleep(3000);
	    Alert a = driver.switchTo().alert();
	    a.getText();
	    a.accept();
	    driver.findElement(By.id("fileupload")).sendKeys("C:\\\\Users\\\\YS00559791\\\\Desktop\\\\Spanish_Notification_Screenshot");
	}

}
//html.com//input-type-file
 