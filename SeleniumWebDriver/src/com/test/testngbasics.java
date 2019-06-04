package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasics 
{
@BeforeSuite
public void initialsetup()
{
	System.out.println("before suite");	
}
@BeforeTest
public void prelaunch()
{
	System.out.println("prelaunching ");
}	
@BeforeClass
public void launchbrowser()
{
	System.out.println("launching the browser");
}
@BeforeMethod
public void enterURL()
{
	System.out.println("enter url");
}
@Test
public void validatetest()
{
	System.out.println("validating the test or actual execution");
}
@Test
public void validatetest2()
{
	System.out.println("validating the test 2 or actual execution 2");
}
@AfterMethod
public void teardown()
{
	System.out.println("logout from app");
}

@AfterClass
public void closebrowser()
{
	System.out.println("close browser");
}
@AfterTest
public void deletecookies()
{
	System.out.println("delete cookies");
}
@AfterSuite
public void closesuit()
{
	System.out.println("closing the suite");
}
}

