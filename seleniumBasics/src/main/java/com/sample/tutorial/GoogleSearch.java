package com.sample.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	
	@Test
	public void search() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.get("https://www.google.com/");
		$driver.manage().window().maximize();
		
		WebElement $element=$driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
		
		$element.sendKeys("Selenium webdriver");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement $element2=$driver.findElement(By.xpath("//li[@role='presentation'][3]"));
		$element2.click();
		
		$driver.quit();
		
		
	}

}
