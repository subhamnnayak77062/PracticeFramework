package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverCheck {
	static WebDriver driver;

		public static void main(String[] args) {
			
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless=new");
			//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			//List<String> extensions = new ArrayList<String>();
			//extensions.add("");
			
			//options.addExtensions(Arrays.asList());
			
			driver = new ChromeDriver(options);
			
			
			
			driver.get("https://www.google.com");
			System.out.println("url launched....");
			System.out.println(driver.getTitle());
			
			
			driver.quit();
			//driver.close();
		}
		
	
}
