package com.sample.masterselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisiblityTest {
	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.get("https://jqueryui.com/");
		$driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser() {
		$driver.quit();
	}
	@Test
	public void webelementvisibilitytest() {
	
		$driver.findElement(By.linkText("Toggle")).click();
		
		String PageTitle=$driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		Assert.assertEquals(PageTitle, "Toggle");
		
		$driver.switchTo().frame($driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement ToggleTitle = $driver.findElement(By.xpath("//div[@id='effect']/h3"));
		Assert.assertEquals(ToggleTitle.getText(), "Toggle");
		
		$driver.findElement(By.id("button")).click();
		
		//System.out.println(ToggleTitle.getText());
		
		Assert.assertEquals(ToggleTitle.isDisplayed(), true);
		
	}
}
