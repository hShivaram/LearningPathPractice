package com.sample.masterpart3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSexecutorTest {
	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		//$driver.get("https://jqueryui.com/");
		$driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser() {
		$driver.quit();
	}
	@Test
	public void javascripttestcase() {
		JavascriptExecutor js=(JavascriptExecutor) $driver;
		js.executeScript("window.location='https://www.rediff.com/'");
		
		//String title=(String) js.executeAsyncScript("return document.title");
		//System.out.println(title);
		new WebDriverWait($driver,30).until(ExpectedConditions.visibilityOf($driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]"))));
		
		WebElement signIn=$driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]"));
		js.executeScript("arguments[0].click()", signIn);
		
		WebElement username=$driver.findElement(By.xpath("//input[@name='login']"));
		js.executeScript("arguments[0].value='shivaram'", username);
		
	}
}
