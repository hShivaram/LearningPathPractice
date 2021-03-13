package com.sample.tutorial;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.get("file:///C:/Selenium%20Tutorial%20Documents/ExplicitWait.html");
		//$driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser() {
		$driver.quit();
	}
	@Test
	public void verifymyalert() {
		WebElement $element=$driver.findElement(By.cssSelector("button[Class^='btn']"));
		$element.click();
		@SuppressWarnings("deprecation")
		WebDriverWait $wait=new WebDriverWait($driver, 30);
		$wait.until(ExpectedConditions.alertIsPresent());
		$driver.switchTo().alert().accept();
		
	}
	@Test
	public void elementclicakble() {
		WebElement $element=$driver.findElement(By.xpath("//button[@id='display-other-button']"));
		$element.click();
		@SuppressWarnings("deprecation")
		WebDriverWait $wait=new WebDriverWait($driver, 15);
		$wait.until(ExpectedConditions.elementToBeClickable($driver.findElement(By.id("hidden"))));

	}
	@Test
	public void visibilityofelement() {
		WebElement $element=$driver.findElement(By.xpath("//button[@id='enable-button']"));
		$element.click();
		@SuppressWarnings("deprecation")
		WebDriverWait $wait=new WebDriverWait($driver, 30);
		$wait.until(ExpectedConditions.visibilityOf($driver.findElement(By.id("disable"))));
	}
	@Test
	public void texttobepresent() {
		WebElement $element=$driver.findElement(By.xpath("//button[@id='populate-text']"));
		$element.click();
		@SuppressWarnings("deprecation")
		WebDriverWait $wait=new WebDriverWait($driver, 15);
		$wait.until(ExpectedConditions.textToBePresentInElement($driver.findElement(By.id("h2")), "Selenium Webdriver"));
	}
	
	

}
