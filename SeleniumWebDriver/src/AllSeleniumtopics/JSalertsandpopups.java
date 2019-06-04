package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSalertsandpopups {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://mypage.rediff.com/login/dologin");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.id("btn_go")).click();
	    Thread.sleep(2000);
	    Alert a = driver.switchTo().alert();
	  String text = a.getText();
	   if(text.equalsIgnoreCase("Please enter a valid email"))
	   {
		   System.out.println("correct message");
	   }else
	   {
		   System.out.println("incorrect message");
	   }
	    a.accept();
	    
	

	}

}
