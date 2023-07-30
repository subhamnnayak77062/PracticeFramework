package com.oops.encapsulation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_LoginPage {
	
	WebDriver driver ; 
	
	public void CheckLoginPage() {
		
		System.setProperty("webdriver.chrome.driver","E:\\Software\\MyNewWorkspace\\PracticeFramework\\lib\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(driver, "standard_user");
		lp.enterPassword(driver, "secret_sauce");
		lp.clickOnLogin(driver);
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		TC_LoginPage tcl = new TC_LoginPage();
		tcl.CheckLoginPage();
		
	}
	
}
