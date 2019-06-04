package AllSeleniumtopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jswithselewebdriv {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get("https://easy.techmahindra.com/");
		driver.findElement(By.xpath("//input[@name='txtLanId']")).sendKeys("bt85079");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("May@2019");
		WebElement clk = driver.findElement(By.xpath("//input[@name='btnlogin']"));
		clk.click();
		WebElement log = driver.findElement(By.xpath("//footer[contains(text(),'© Tech Mahindra 2016')]"));
		Thread.sleep(2000);
		
	
		//driver.navigate().back();
		
		
		scrolltoview(driver,log);
		drawborder(clk,driver);
		pagetitle(driver);
		scrollpage(driver);
		getinnertext(driver);
		clickelement(driver,clk);
		generateAlert(driver,"login issue");
		refwithjs(driver);
		
		//to perform refresh using javascript executor
	}
		public static void refwithjs(WebDriver driver)
		{
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
		}

	// to draw border :
		public static void drawborder(WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border= '3px solid blue'",element);
		}
		
		//to generate own alert popup
		public static void generateAlert(WebDriver driver, String message)
		{
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("alert('This alert message is appropriate')");
			
		}
		
		// to click elements by JS
		public static void clickelement(WebDriver driver, WebElement element)
		{
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();",element);
			
		}
		
		// to get the entire page text
				public static void getinnertext(WebDriver driver)
				{
					JavascriptExecutor js = ((JavascriptExecutor)driver);
				  String s=js.executeScript("return document.documentElement.innerText;").toString();
					System.out.println(s);
				}	
				
				// to get the title of the page
			public static void pagetitle(WebDriver driver)
				{
					JavascriptExecutor js = ((JavascriptExecutor)driver);
				  String ss=js.executeScript("return document.title;").toString();
					System.out.println(ss);
				}		
			//to perform scrolling
			public static void scrollpage(WebDriver driver)
			{
				JavascriptExecutor js = ((JavascriptExecutor)driver);
			  js.executeScript("window.scrollTo(0,document.body.scrollheight)");
				
			}	
			
			public static void scrolltoview(WebDriver driver,WebElement element)
			{
				JavascriptExecutor js = ((JavascriptExecutor)driver);
			  js.executeScript("arguments[0].scrollIntoView(true);",element);
				
			}	
	}


