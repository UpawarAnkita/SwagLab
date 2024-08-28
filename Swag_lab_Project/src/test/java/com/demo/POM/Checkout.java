package com.demo.POM;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	WebDriver driver = null;
	
	public Checkout(WebDriver driver) {
		this.driver=driver;
		
	}
	By username = By.id("user-name");
	By Password = By.name("password");
	By LoginBtn = By.name("login-button");
	By addtocartbtn = By.name("add-to-cart-sauce-labs-backpack");
	By CartIcon = By.className("shopping_cart_link");
	By checkout = By.id("checkout");
	By FirstName = By.name("firstName");
	By LastName = By.name("lastName");
	By PostalCode = By.name("postalCode");
	By Continuebtn = By.name("continue");
	By Finish = By.id("finish");
	
	public void SetUsername(String name) {
		driver.findElement(username).sendKeys(name);
		
	}
	public void SetPassword(String pass) {
		driver.findElement(Password).sendKeys(pass);
		
	}
	public void clickloginbutton(){
		driver.findElement(LoginBtn).click();
		
	}
	public void Clickcartbtn() {
		driver.findElement(addtocartbtn).click();
		}
	public void Clickcarticon() {
		driver.findElement(CartIcon).click();
	}
	
	public void ClickCheckOut() {
		driver.findElement(checkout).click();
	}
	
	public void EnterFirstName(String name) {
		driver.findElement(FirstName).sendKeys(name);
	}
	public void EnterLastName(String lastname) {
		driver.findElement(LastName).sendKeys(lastname);
	}
	public void EnterPostalCode(String postal) {
		driver.findElement(PostalCode).sendKeys(postal);
	}
	public void continuebutton() {
		driver.findElement(Continuebtn).click();
	}
	public void finishbutton() {
		driver.findElement(Finish).click();
	}
	}
