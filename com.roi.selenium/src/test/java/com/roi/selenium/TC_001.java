package com.roi.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_001 {
	
	WebDriver Driver;
	String ExpectedURL="http://10.120.101.74:8088/ROI_UI/index.html#/wizard";
	
	@Test(priority=1)
	public void Initialise() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditya.Kumar\\Downloads\\com.roi.selenium\\Resources\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("http://10.120.101.74:8088/ROI_UI/index.html#/wizard");
		Driver.manage().window().maximize();
		Thread.sleep(7000);
		try {
		Assert.assertEquals(ExpectedURL,Driver.getCurrentUrl());
		System.out.println("WebPage is redirected to correct URL");
		}catch(Exception e) {
			e.printStackTrace();
		}
		Driver.close();
	}
}
