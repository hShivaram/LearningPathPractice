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

public class MutliSelectDropdown {
	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		$driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser() {
		$driver.quit();
	}
	@Test
	public void MultiSelectDrop() throws InterruptedException {
		$driver.switchTo().frame($driver.findElement(By.xpath("//iframe[@name='iframeResult']")));
		WebElement multi=$driver.findElement(By.name("cars"));
		Select select = new Select(multi);
		System.out.println(select.isMultiple());
		select.selectByValue("audi");
		select.selectByIndex(1);
		Thread.sleep(3000);
		System.out.println(select.getFirstSelectedOption().getText());
		System.out.println("************************");
		
		List<WebElement> selectedopt=select.getAllSelectedOptions();
		for(WebElement opt: selectedopt) {
			System.out.println(opt.getText());
		}
		
		
	}
}
