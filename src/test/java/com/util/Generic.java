package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic {
	static WebDriver driver;
public WebDriver openBrowser(WebDriver driver)
{
	System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
}
public void closeBrowser(WebDriver driver) {
	driver.quit();
}	
}
