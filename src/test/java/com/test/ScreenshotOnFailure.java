package com.test;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotOnFailure {
	
	private WebDriver driver;

	
	@BeforeMethod
	public void startBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\Software\\MyNewWorkspace\\PracticeFramework\\lib\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
	}
	
	@Test
	public void exampleTest() throws InterruptedException{
		LoadProperty lp = new LoadProperty();
		String url;
		try {
			url = lp.ReadPropertyFile();
			System.out.println(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//html"));
		if (driver.getTitle()=="Gmail") {
			System.out.println("The Page Title is :" +driver.getTitle());
			
		}else {
			System.out.println("IncorrectPageTitle");
			Assert.assertTrue(false);
		}
		
	}
	
	@AfterMethod
	public void onTestFailure(ITestResult result) {
		
		if (result.getStatus()==ITestResult.FAILURE) {
			captureScreenshot(result.getName());
		}
		driver.quit();
	}
	
	
	public void captureScreenshot(String screenshotName) {
		
			TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
			File screenshotFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
			
			String destinationPath = "E:\\Software\\MyNewWorkspace\\PracticeFramework\\screenshot\\"+screenshotName +".png";
			
			
			try {
				FileUtils.copyFile(screenshotFile, new File(destinationPath));
				System.out.println("Screenshot captured : "+destinationPath);

			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
	}
	
		
	}
	
