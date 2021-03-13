package com.sample.tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {

	@Test
	public void verifyfacebooktitle() {
		
		String URL="https://www.facebook.com/";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver $driver=new ChromeDriver();
		//System.getProperty(key, def)
		
		$driver.get(URL);
		
		$driver.manage().window().maximize();
		
		String Title=$driver.getTitle();
	
		Assert.assertEquals("Facebook – log in or sign up", Title, "Passed");
		
		$driver.close();
		
	}
}
