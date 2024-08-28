package com.demo.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {
	WebDriver driver = null;
	
	public LogOut(WebDriver driver) {
		this.driver=driver;
		
		}
	By Menubtn = By.id("react-burger-menu-btn");
	By Logoutbtn = By.className("bm-item menu-item");
	
	
	public void ClickMenuBtn() {
		driver.findElement(Menubtn).click();
		
	}
	

	public void ClickLogOutBtn() {
		driver.findElement(Logoutbtn).click();
		
	}

}
