package com.sample.masterpart3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {
	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.get("https://the-internet.herokuapp.com");
		$driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closebrowser() {
		$driver.quit();
	}
	
	@Test
	public void uploadtestcase() {
		$driver.findElement(By.linkText("File Upload")).click();
		
		WebElement upload=$driver.findElement(By.id("file-upload"));
		String filepath="//C:\\Personal Documents\\download.png";
		upload.sendKeys(filepath);
		$driver.findElement(By.id("file-submit")).click();
		
	}
}
