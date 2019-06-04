package AllSeleniumtopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class headlesschrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
	    options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://easy.techmahindra.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		

	}

}
