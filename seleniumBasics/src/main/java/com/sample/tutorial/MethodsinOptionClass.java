package com.sample.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsinOptionClass {
	
	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	

	public void samplesetbinary() {
		
		 WebDriverManager.chromedriver().setup();
		 $options.setBinary("");
		 $driver=new ChromeDriver($options);
		 $driver.manage().window().maximize();
		 
		 
	}
	public void acceptcerificate() {
		
		 WebDriverManager.chromedriver().setup();
		 $options.setAcceptInsecureCerts(true);
		 $driver=new ChromeDriver($options);
		 $driver.manage().window().maximize();
		 $driver.get("https://cacert.org");
		 
		 
	}
	
	
	public void setProxy() {
		 WebDriverManager.chromedriver().setup();
		 Proxy prox=new Proxy();
		 prox.setProxyAutoconfigUrl("https://");
		 $options.setProxy(prox);
		 $driver=new ChromeDriver($options);
		 
		 
		
	}
	

	public void openheadless() {
		 WebDriverManager.chromedriver().setup();
		 $options.setHeadless(true);
		 $driver=new ChromeDriver($options);
		 $driver.manage().window().maximize();
		 $driver.get("https://cacert.org");
		 
		 String title=$driver.getTitle();
		 Assert.assertEquals(title, "Welcome to CAcert.org");
		 
		 $driver.close();
		
	}
	
	
	public void addargumentexample() {
		 WebDriverManager.chromedriver().setup();
		 $options.addArguments("--incognito");
		 $options.setHeadless(true);
		 $driver=new ChromeDriver($options);
		 $driver.manage().window().maximize();
		 $driver.get("https://www.bing.com");
		 
		 
		 $driver.close();
	}
	
	
	public void managenotifications() {
		 WebDriverManager.chromedriver().setup();
		 $options.addArguments("--disable-notifications");
		 //$options.setHeadless(true);
		 $driver=new ChromeDriver($options);
		 $driver.manage().window().maximize();
		 $driver.get("https://drupal-stage-web.weather.com/en-IN");
		 
		 
		 $driver.close();
	}
	
	@Test
	public void unhandledchrome() {
		 WebDriverManager.chromedriver().setup();
		 $options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS_AND_NOTIFY);
		 //$options.setHeadless(true);
		 $driver=new ChromeDriver($options);
		 $driver.manage().window().maximize();
		 $driver.get("https://drupal-stage-web.weather.com/en-IN");
		 $driver.findElement(By.id("Login In"));
		 
		 
		 $driver.close();
	}

}
