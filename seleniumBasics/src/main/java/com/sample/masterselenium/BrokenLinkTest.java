package com.sample.masterselenium;

import java.util.List;
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

public class BrokenLinkTest {
	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.get("https://edition.cnn.com/");
		$driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser() {
		$driver.quit();
	}
	@Test
	public void extracttextfromfacebook() {
		
		List<WebElement> links=$driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links in the webpage are: "+links.size());
		
		for(WebElement link : links) {
			
			String URL = link.getAttribute("href");
			Getlinkstatus.linkstatuscode(URL);
		}
		System.out.println("Total number of broken links" + Getlinkstatus.invalidlink);
		
	}
}
