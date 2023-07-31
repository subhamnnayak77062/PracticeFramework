package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationClassCheck {

		static WebDriver driver = new ChromeDriver();
	
		@Parameters({"url1"})
		@Test(priority=1, groups = {"Sanity"} , timeOut=2000 , dependsOnMethods= {"LoginSteps"})
		public void checkLogin(String url1) {
			//driver = new ChromeDriver();
			System.out.println("check login page");
			driver.get(url1);
			
		}
		
		@Test(priority=2,enabled=false, groups = {"Regression"})
		public void checkErrorsonPage() {
			System.out.println("check eror on the page");
		}
		
		
		@Parameters({"url"})
		@Test(priority=2, groups= {"Sanity"}, invocationCount=2)
		public void LoginSteps(String url) throws InterruptedException {
			//driver = new ChromeDriver();
			driver.get(url);
			
			Thread.sleep(2000);
			System.out.println("inside the login steps");
			
			//driver.quit();
			
		}
}
