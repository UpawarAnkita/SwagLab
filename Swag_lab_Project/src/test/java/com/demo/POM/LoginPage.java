package com.demo.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver = null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.id("user-name");
	By Password = By.name("password");
	By LoginBtn = By.name("login-button");
	
	public void SetUsername(String name) {
		driver.findElement(username).sendKeys(name);
		
	}
	public void SetPassword(String pass) {
		driver.findElement(Password).sendKeys(pass);
		
	}
	public void clickloginbutton(){
		driver.findElement(LoginBtn).click();
		
	}
}
