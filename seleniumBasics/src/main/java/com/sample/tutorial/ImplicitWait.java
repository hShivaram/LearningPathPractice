package com.sample.tutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	
	@Test
	public void impliwait() {
		ChromeOptions $options=new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		WebDriver $driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.get("https://www.google.com/");
		
		$driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement $element=$driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
		
		$element.sendKeys("Selenium webdriver");
		
		
		WebElement $element2=$driver.findElement(By.xpath("//li[@role='presentation'][3]"));
		$element2.click();
		
		$driver.quit();
	}

}
