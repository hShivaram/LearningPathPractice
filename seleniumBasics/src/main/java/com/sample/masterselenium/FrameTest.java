package com.sample.masterselenium;

import java.util.List;
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

public class FrameTest {

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
	public void Switchframe() {
		
		$driver.findElement(By.linkText("Button")).click();
		WebElement pagetitle=$driver.findElement(By.xpath("//h1[@class='entry-title']"));
		Assert.assertEquals(pagetitle.getText(), "Button");
		
		$driver.switchTo().frame($driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement $element=$driver.findElement(By.xpath("//div[@class='widget']/h1"));
		Assert.assertEquals($element.getText(),"Widget Buttons");
		
		$driver.switchTo().parentFrame();
		WebElement $exampletext=$driver.findElement(By.xpath("//div[@class='demo-list']/h2"));
		Assert.assertEquals($exampletext.getText(),"Examples");
		
	}
}
