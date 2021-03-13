package com.sample.masterpart2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest {
	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.get("https://www.facebook.com/");
		$driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser() {
		$driver.quit();
	}
	@Test
	public void SelectDOB() {
		$driver.findElement(By.xpath("//a[@id='u_0_2' and @data-testid='open-registration-form-button']")).click();
		WebElement month=$driver.findElement(By.name("birthday_month"));
		Select select = new Select(month);
		select.selectByIndex(4);
		
		WebElement year=$driver.findElement(By.name("birthday_year"));
		Select yearsel = new Select(year);
		yearsel.selectByValue("1993");
		
		List<WebElement> totmonth=select.getOptions();
		for(WebElement tot : totmonth) {
			System.out.println(tot.getText());
		}
	}
}
