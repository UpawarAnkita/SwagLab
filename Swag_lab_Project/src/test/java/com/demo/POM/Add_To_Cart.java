package com.demo.POM;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class Add_To_Cart {

     WebDriver driver = null;
	
	public Add_To_Cart(WebDriver driver) {
		this.driver = driver;
	}
	By username = By.id("user-name");
	By Password = By.name("password");
	By LoginBtn = By.name("login-button");
	By addtocartbtn = By.name("add-to-cart-sauce-labs-backpack");
	By CartIcon = By.className("shopping_cart_link");

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
}
