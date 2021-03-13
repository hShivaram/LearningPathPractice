package com.sample.masterselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtractText {

	public class SampleClass {

		WebDriver $driver=null;
		ChromeOptions $options=new ChromeOptions();
		@BeforeMethod
		public void setup() {
			
			WebDriverManager.chromedriver().setup();
			$options.addArguments("--Incognito");
			$driver=new ChromeDriver($options);
			$driver.manage().window().maximize();
			$driver.get("https://www.facebook.com/");
			$driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		@AfterMethod
		public void closebrowser() {
			$driver.quit();
		}
		@Test
		public void extracttextfromfacebook() {
			String visibletext=$driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
			Assert.assertEquals(visibletext, "Facebook helps you connect and share with the people in your life.");
			
			String LoginText = $driver.findElement(By.xpath("//button[@name='login' and contains(@class,'_42ft')]")).getText();
			System.out.println(LoginText);
			
			String emailtext = $driver.findElement(By.xpath("//input[@name='email' and contains(@class,'_55r1')]")).getAttribute("aria-label");
			System.out.println(emailtext);
		}
}
}
