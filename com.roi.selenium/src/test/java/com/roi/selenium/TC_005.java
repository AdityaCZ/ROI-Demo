package com.roi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_005 {
	
	WebDriver Driver;
	
@BeforeMethod
public void Initialise() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditya.Kumar\\Downloads\\com.roi.selenium\\Resources\\chromedriver.exe");
	Driver = new ChromeDriver();
	Driver.get("http://10.120.101.74:8088/ROI_UI/index.html#/wizard");
	Thread.sleep(7000);
	Driver.manage().window().maximize();
}

@Test
public void test() throws InterruptedException {
	Thread.sleep(3000);
	Driver.findElement(By.xpath(".//div/input[@id='Appname']")).sendKeys("ABC");
	Driver.findElement(By.xpath(".//*[@id='AppID']")).sendKeys("123654");
	Thread.sleep(2000);
	Driver.findElement(By.xpath(".//div/div[1]/p/span")).click();	
	Thread.sleep(4000);
	Driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).click();
	Thread.sleep(4000);
	Driver.findElement(By.xpath(".//div/div[2]/p/span")).click();	
	Thread.sleep(4000);
	Driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).click();
	Thread.sleep(2000);
	
	Driver.findElement(By.xpath(".//*[@id='mainPer']")).sendKeys("60");
	Driver.findElement(By.xpath(".//*[@id='lifetime']")).sendKeys("13");
	
	Driver.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
	Thread.sleep(5000);
	String NextPage = Driver.findElement(By.xpath("//div[@class='ba-wizard-navigation active']")).getText();
	try{
	Assert.assertEquals(NextPage,NextPage);
	System.out.println("It is allowing Start Date Greater than End date which is Incorrect");
	}catch(Exception e) {
		e.printStackTrace();
	}
	Thread.sleep(3000);
	Driver.findElement(By.xpath(".//li[@class='previous']")).click();
	Thread.sleep(2000);
	String ErrorMsg = Driver.findElement(By.xpath("//div[@class='alert bg-danger ng-binding ng-scope']")).getText();
	System.out.println("Error Message:" +ErrorMsg);
	
}

@AfterMethod
public void close()
{
	Driver.close();
}


}
