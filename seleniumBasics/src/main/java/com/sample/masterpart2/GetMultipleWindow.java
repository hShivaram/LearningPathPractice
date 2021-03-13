package com.sample.masterpart2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMultipleWindow {

	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.get("https://www.jobserve.com/");
		$driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser() {
		$driver.quit();
	}
	//@Test
	public void handlewindow() {
		String mainpage=$driver.getWindowHandle();
		System.out.println(mainpage);	
	}
	@Test
	public void multiplewindow() {
		String mainpage=$driver.getWindowHandle();
		System.out.println(mainpage);
		
		$driver.findElement(By.xpath("//a[@id='SPTPosTitleLink' and contains(@title,'Machine')]")).click();
		
		Set<String> WID=$driver.getWindowHandles();
		Iterator<String> itr=WID.iterator();
		
		String mainID=itr.next();
		String currentID=itr.next();
		$driver.switchTo().window(currentID);
		
		String text=$driver.findElement(By.id("td_jobpositionnolink")).getText();
		Assert.assertEquals(text, "Machine Learning Engineer - Bangalore - Immediate Start - Permanent");
		
		
		
	}
}
