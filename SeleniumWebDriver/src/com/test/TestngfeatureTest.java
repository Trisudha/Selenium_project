package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngfeatureTest
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}
@Test
public void login()
{
	System.out.println("login test");
}
@Test(dependsOnMethods="login")
public void homepage1()
{
	
	System.out.println("homepage test");
	}
@Test(dependsOnMethods="homepage1")
public void search()
{
	System.out.println("searchpage test");
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
