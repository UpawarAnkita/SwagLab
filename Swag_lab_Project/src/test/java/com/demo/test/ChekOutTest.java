package com.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.POM.Checkout;

public class ChekOutTest {
WebDriver driver = null;
	
//	@BeforeMethod
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		driver.get("https://www.saucedemo.com/checkout-step-one.html");
//	}
	@Test
	public void ChekOutprocess() {
		Checkout check = new Checkout(driver);
//		check.SetUsername("standard_user");
//		check.SetPassword("secret_sauce");
//		check.clickloginbutton();
//		check.Clickcartbtn();
//		check.Clickcarticon();
		check.ClickCheckOut();
		check.EnterFirstName("Ankita");
		check.EnterLastName("xyz@123");
		check.EnterPostalCode("234321");
		check.continuebutton();
		check.finishbutton();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	

}
