package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class secondtest
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
@Test(priority=3,groups="launchtitle")
public void googleTitleTest()
{
	String title = driver.getTitle();
	System.out.println(title);
}
@Test(priority=1,groups ="launchtitle")
public void  googleLogoTest()
{
	boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
}
@Test(priority=2,groups="Title")
public void mailLinkTest()
{
	boolean b1 = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[1]/a")).isDisplayed();
	
}
@Test(priority=4,groups="Title")
public void testCase1()
{
	System.out.println("test1");
}
@Test(groups="test")
public void testCase2()
{
	System.out.println("test2");
}
@Test(priority=5,groups="test")
public void testCase3()
{
	System.out.println("test3");
}

@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
