package com.demo.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demo.POM.Add_To_Cart;
import com.demo.POM.LoginPage;

public class LoginTest {		WebDriver driver = null;		@BeforeMethod	public void setup() {		driver = new ChromeDriver();		driver.manage().window().maximize();		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));		driver.get("https://www.saucedemo.com/");	}	 @Test 	public void login() {		LoginPage page = new LoginPage(driver);				page.SetUsername("standard_user");		page.SetPassword("secret_sauce");		page.clickloginbutton();	}	//	@AfterMethod//	public void tearDown() {//		driver.quit();//	}}