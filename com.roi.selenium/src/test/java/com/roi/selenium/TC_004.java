package com.roi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_004 {
		
			WebDriver Driver;
			
		@BeforeMethod
		public void Initialise() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			ChromeOptions ChromeOptions = new ChromeOptions();
			ChromeOptions.addArguments("--headless", "--no-sandbox");
			Driver = new ChromeDriver(ChromeOptions);
			Driver.get("http://10.120.101.74:8088/ROI_UI/index.html#/wizard");
			Thread.sleep(7000);
			Driver.manage().window().maximize();
		}

		@Test
		public void test() throws InterruptedException {
			Thread.sleep(3000);
			Driver.findElement(By.xpath(".//div/input[@id='Appname']")).sendKeys("ABC");
			Driver.findElement(By.xpath(".//*[@id='AppID']")).sendKeys("123654");
//			Select s = new Select(Driver.findElement(By.xpath("//div/button[@data-id='tech']")));
//			s.selectByIndex(2);
//			Select s1 = new Select(Driver.findElement(By.xpath("//div/button[@data-id='bc']")));
//			s1.selectByIndex(2);
			Thread.sleep(2000);
			Driver.findElement(By.xpath(".//div/div[1]/p/span")).click();	
			Thread.sleep(4000);
			Driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(4000);
			Driver.findElement(By.xpath(".//div/div[2]/p/span")).click();	
			Thread.sleep(4000);
			Driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			
			Driver.findElement(By.xpath(".//*[@id='mainPer']")).sendKeys("60");
			Driver.findElement(By.xpath(".//*[@id='lifetime']")).sendKeys("13");
			
			Driver.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath(".//*[@id='tcwf']")).sendKeys("500");
			Driver.findElement(By.xpath(".//*[@id='tcab']")).sendKeys("400");
			Driver.findElement(By.xpath(".//*[@id='pftc']")).sendKeys("80");
			Driver.findElement(By.xpath(".//*[@id='conp']")).sendKeys("30");
			Driver.findElement(By.xpath(".//*[@id='cofp']")).sendKeys("70");
			Thread.sleep(6000);
			//Life Critical Suite 
			Driver.findElement(By.xpath(".//*[contains(text(), 'Life Critical Suite')]")).click();
			
			Thread.sleep(5000);
			
			Driver.findElement(By.xpath(".//div[3]/div[2]/div/div/div/div[1]/label/span")).click();
			Thread.sleep(2000);
			Driver.findElement(By.xpath(".//*[@id='lcs']")).sendKeys("70");
			//Driver.findElement(By.xpath(".//*[@id='spr']")).sendKeys("70");
			//Driver.findElement(By.xpath(".//*[@id='mpr']")).sendKeys("3");
			//Driver.findElement(By.xpath(".//*[@id='cpr']")).sendKeys("50");
			Driver.findElement(By.xpath(".//*[@id='exelc']")).sendKeys("30");
			Driver.findElement(By.xpath(".//*[@id='eoblc']")).sendKeys("20");
			
			
			
			
			Thread.sleep(2000);
			
			Driver.findElement(By.xpath(".//li[@class='next']/button[@ng-click='validate()']")).click();
			Thread.sleep(4000);
			Driver.findElement(By.xpath(".//li[@class='next']/button[@ng-click='createObject()']")).click();
			Thread.sleep(2000);
			
			Driver.switchTo().alert().accept();
			System.out.println("Success");

		}
		@AfterMethod
			public void close()
			{
				Driver.close();
			}
		

	}

