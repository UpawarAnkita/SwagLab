package com.demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.demo.POM.Add_To_Cart;

public class AddtocartTest {
	WebDriver driver = new ChromeDriver();
	
	
//	public void setup() {
//		//driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//		driver.get("https://www.saucedemo.com/inventory.html");
//	}
	@Test 
	public void AddToCart() {
		Add_To_Cart cart = new Add_To_Cart(driver);
		
//		cart.SetUsername("standard_user");
//		cart.SetPassword("secret_sauce");
//		cart.clickloginbutton();
		cart.Clickcartbtn();
		cart.Clickcarticon();
	}
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
}


