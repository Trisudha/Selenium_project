package com.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Downloadconcept 
{
WebDriver driver;
File folder;


@BeforeMethod
public void setUp()
{
	folder = new File(UUID.randomUUID().toString());
	folder.mkdir();
	
	//chrome
	System.setProperty("webdriver.chrome.driver","D:\\sudha pls dont delete\\Java folder\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	
	Map<String,Object> prefs = new HashMap<String,Object>();
	prefs.put("profile.default_content_settings.popups", 0);
	prefs.put("download.default_directory",folder.getAbsolutePath());
	
	options.setExperimentalOption("prefs", prefs);
	//DesiredCapabilities cap = DesiredCapabilities.chrome();
	//cap.setCapability(ChromeOptions.CAPABILITY, options);
	
	driver = new ChromeDriver();
}

@Test
public void downloadFileConcept() throws InterruptedException
{
	driver.get("the-internet.herokuapp.com/download");
	driver.findElement(By.cssSelector("#content > div > a:nth-child(24)")).click();
	Thread.sleep(2000);
	File listofFiles[] = folder.listFiles();
	
}


@AfterMethod
public void tearDown()
{
	driver.quit();
	for(File file :folder.listFiles())
	{
		file.delete();
	}
	folder.delete();
	
}


}
