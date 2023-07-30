package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage{

public WebDriver driver;
private By username=By.xpath("");
private By password=By.name("");


public LoginPage(WebDriver driver){

	this.driver=driver;
}

public WebElement EmailId(){
	return driver.findElement(username);
}

public WebElement Password(){
	return driver.findElement(password);
}



@Test
public void LoginTC(){

LoginPage lp = new LoginPage(driver);
lp.EmailId().sendKeys("tester");
lp.Password().sendKeys("12345");

}
}

