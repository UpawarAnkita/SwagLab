package com.demo.test;

import org.openqa.selenium.WebDriver;

import com.demo.POM.LogOut;

public class LogOutTest {
	WebDriver driver = null;
	
	public void TestLogout() {
		LogOut logout = new LogOut(driver);
		logout.ClickMenuBtn();
		logout.ClickLogOutBtn();
		
	}

}
