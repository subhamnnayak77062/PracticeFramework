package com.oops.encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private By username = By.cssSelector("#user-name");
	
	@FindBy(css = "#password")
	private WebElement password;
	//private By password = By.cssSelector("#password");
	
	//private WebElement login = driver.findElement(By.cssSelector("#login-button"));
	private By login = By.cssSelector("#login-button");
	
	
	
	
	
	
	public void enterUserName(WebDriver driver  , String userName) {
		driver.findElement(username).sendKeys(userName);
		System.out.println("enterUserName()....");
	}
	public void enterPassword(WebDriver driver ,String userPassword) {
		password.sendKeys(userPassword);
		//driver.findElement(password).sendKeys(userPassword);
		System.out.println("enterPassword()....");
	}
	public void clickOnLogin(WebDriver driver) {
		//login.click();
		driver.findElement(login).click();
		System.out.println("clickOnLogin()....");
	}

}
