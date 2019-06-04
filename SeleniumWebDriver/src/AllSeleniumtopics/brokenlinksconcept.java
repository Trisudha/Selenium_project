package AllSeleniumtopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinksconcept {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://signin.ebay.in/ws/eBayISAPI.dll?SignIn&regUrl=https%3A%2F%2Freg.ebay.in%2Freg%2FPartialReg");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("Trisudha.lucky1@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Trisha123$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='sgnBt']")).click();
		
		List<WebElement> lstag = driver.findElements(By.tagName("a"));
		lstag.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println(lstag.size());
		List<WebElement> activelinks = new ArrayList<WebElement>();
		for(int i=0;i<lstag.size();i++)
		{
			if(lstag.get(i).getAttribute("href")!=null)
			{
				activelinks.add(lstag.get(i));
			}
		
		System.out.println(lstag.get(i).getText());
			
		}
		for(int j=0;j<activelinks.size();j++)
		{
		HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activelinks.get(j).getAttribute("href")+ ""+response);
		
	}

}
}
