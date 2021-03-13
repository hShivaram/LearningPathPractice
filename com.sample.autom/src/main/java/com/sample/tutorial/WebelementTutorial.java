package com.sample.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementTutorial {

	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	
	@Test
	public void elementfinf() {
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		
		$driver.get("https://www.facebook.com/");
		$driver.manage().window().maximize();
		$driver.findElement(By.id("email")).sendKeys("sss@gmail.com");
		$driver.findElement(By.id("pass")).sendKeys("12356899");
		$driver.quit();
		}
	
}
