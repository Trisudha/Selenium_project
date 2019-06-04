package AllSeleniumtopics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Differentlocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.in/reg/PartialReg");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("mahid");
		driver.findElement(By.id("lastname")).sendKeys("trish");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("odc.jyoti@gmail.com");
		driver.findElement(By.cssSelector("html body div.sz980 div#pgWidth.pgWidth div#mainContent.mcd_p div.mcd div.partialRegForm form#ppaRegForm div#ppa_id.ppa_sir div.txcSir div div#PASSWORD_wrp.credential div#PASSWORD_d div.fv-w.width100.textbox div#PASSWORD_r.fv-tw input#PASSWORD.re-w3.wide.fld")).sendKeys("Trisha12345$");
	Thread.sleep(5000);
	driver.findElement(By.id("ppaFormSbtBtn")).click();
	//driver.navigate().to("https://reg.ebay.in/reg/PartialReg");
	driver.findElement(By.id("reginter")).click();
		
		
		
		
		

	}

}
