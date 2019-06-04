package AllSeleniumtopics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class readpropfile
{
static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	Properties prop = new Properties();
	FileInputStream fs= new FileInputStream("C:\\Users\\YS00559791\\eclipse-workspace\\SeleniumWebDriver\\src\\AllSeleniumtopics\\config.properties");
	prop.load(fs);
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
	System.out.println(prop.getProperty("URL"));
	String browname = prop.getProperty("browser");
	System.out.println();
	
	if(browname.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 String ss=	prop.getProperty("URL");
	 driver.get(ss);
	 
		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("userid_xpath"))).sendKeys(prop.getProperty("userid"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();
	 	}
	else if(browname.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","D:\\sudha pls dont delete\\Java folder\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver	driver = new FirefoxDriver();
		String ss=	prop.getProperty("URL");
		   driver.get(ss);

			driver.findElement(By.xpath(prop.getProperty("userID_xpath"))).sendKeys(prop.getProperty("UserID"));
			driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();
		 }

	
		}
	
		
}
	

