package com.test;

import org.testng.annotations.Test;

public class exceptionTimeouttest
{
@Test(expectedExceptions=NumberFormatException.class)
public void infinitetest()
{
	String x ="100A";
	Integer.parseInt(x);
}
}
