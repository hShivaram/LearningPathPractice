package com.sample.masterpart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.get("https://www.americangolf.eu/");
		$driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser() {
		$driver.quit();
	}
	@Test
	public void hovermouse() {
		WebElement Menu=$driver.findElement(By.xpath("//*[@id=\"header-navigation\"]/div[1]/ul/li[3]"));
		//new WebDriverWait($driver,30).until(ExpectedConditions.visibilityOf($driver.findElement(By.xpath("//ul[@class='menu-category ul-level-1']/li[3]/a"))));
		
		Actions action=new Actions($driver);
		
		action.moveToElement(Menu).build().perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		$driver.findElement(By.xpath("//*[@id=\"CLOTHFOOTW_1\"]/ul/li[3]/ul/li[1]/a/span")).click();
		
	}
}
