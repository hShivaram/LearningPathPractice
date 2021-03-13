package com.sample.tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invokedynamic {

	WebDriver $driver= null;
	String URL="https://www.facebook.com/";
	@Parameters("browser")	
	
	
	@BeforeMethod
	public void openbrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			
		 $driver=new ChromeDriver();
		 
		}else {
			System.out.println("No browser available in system");
		}
		
		$driver.manage().window().maximize();
	}
	
	@Test
	public void verifyfacebooktitle() {
		$driver.get(URL);
		String Title=$driver.getTitle();
		Assert.assertEquals("Facebook – log in or sign up", Title, "Passed");
		
	}
	
	@AfterMethod
	public void endbrowser() {
		$driver.quit();
	}
	
}
