package com.sample.tutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageloadTimeout {

	@Test
	public void timeout() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions $options=new ChromeOptions();
		$options.addArguments("--Incognito");
		WebDriver $driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		$driver.get("https://edition.cnn.com/");
		$driver.quit();
		
		
		 
		
	}
}
