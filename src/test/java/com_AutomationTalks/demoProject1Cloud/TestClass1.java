package com_AutomationTalks.demoProject1Cloud;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {

	public static WebDriver driver;
	
	@BeforeTest
	public void launchDriver()
	{
		System.setProperty("webdriver.chrome.driver","D://selenium components/geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver .manage().window().maximize();
	
	}
	@Test 
	public void Test1()
	{
		driver.get("https://automationtalks.com/");
		System.out.println("Test1 title is "+driver.getTitle());
	}
	 @Test
	public void Test2()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
	}
	@Test
	public void Test3()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test1 title is "+driver.getTitle());
	}
	@AfterTest()
	public void quit()
	{
		driver.quit();
	}
}
