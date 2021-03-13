package com.sample.liveproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class PortfolioTest {

	WebDriver driver = null;

	@BeforeSuite
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Apply Implicit wait
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);

	}

	
	 @AfterMethod 
	 public void closeBrowser() { driver.quit(); }
	 

	@Test(priority = 1)
	public void testCreatePortfolio() {
		// Open the Refiff
		driver.get("https://www.rediff.com/");
		//Click the Money Link
		driver.findElement(By.xpath("//a[contains(@class,'moneyicon')]")).click();
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.id("useremail")).sendKeys("hShivaram93@rediffmail.com");
		driver.findElement(By.id("useremail")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userpass"))));
		
		driver.findElement(By.id("userpass")).sendKeys("no123@MEC");
		driver.findElement(By.id("loginsubmit")).sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='create' and @id='create']")));
		driver.findElement(By.xpath("//input[@name='create' and @id='create']")).click();

		driver.findElement(By.xpath("//input[@name='create' and @id='create']")).clear();
		driver.findElement(By.xpath("//input[@name='create' and @id='create']")).sendKeys("hShivaram Portfolio");

		driver.findElement(By.id("createPortfolioButton")).click();

	}

	@Test(priority = 2)
	public void testportfolioVerification() {

		waitforElement("//*[@id='portfolioid']", "hShivaram Portfolio");

	}
	
	@Test (priority=3)
	public void testDeletePortfolio(){
		driver.findElement(By.id("deletePortfolio")).click();
		
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}

	public void waitforElement(String xpath, String elementValue) {

		int i = 0;
		while (i != 10) {
			WebElement portfolioDropdown = driver.findElement(By.xpath(xpath));

			Select select = new Select(portfolioDropdown);
			String portfolioName = select.getFirstSelectedOption().getText();

			if (portfolioName.equalsIgnoreCase(elementValue)) {
				return;
			} else {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
		}

		Assert.assertTrue(false, "The Given Text " + elementValue + " is not present in Portfolio Dropdown");
	}
}
