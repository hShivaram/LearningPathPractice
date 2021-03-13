package com.sample.liveproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver = null;

	@BeforeMethod
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void loginRediff() {
		
		//Open the Refiff
		driver.get("https://www.rediff.com/");
		//Click the Money Link
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a[2]")).click();
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("login1")).sendKeys("hShivaram93");
		driver.findElement(By.id("login1")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("password"))));
		
		driver.findElement(By.id("password")).sendKeys("no123@MEC");
		driver.findElement(By.name("proceed")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//*[@id='username']/a")).isDisplayed();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
