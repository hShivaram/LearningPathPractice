package selenium.SelBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	WebDriver $driver=null;
	ChromeOptions $options=new ChromeOptions();
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		$options.addArguments("--Incognito");
		$driver=new ChromeDriver($options);
		$driver.manage().window().maximize();
		$driver.get("https://jqueryui.com/");
		$driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser() {
		$driver.quit();
	}
	//@Test
	public void dragdroptestcse() {
		JavascriptExecutor js = (JavascriptExecutor) $driver;
		$driver.findElement(By.linkText("Draggable")).click();
		$driver.switchTo().frame(0);
		WebElement drag=$driver.findElement(By.xpath("//div[@id='draggable' and contains(@class,'ui-widget-content ui-draggable ui-draggable-handle')]"));
		js.executeScript("arguments[0].scrollIntoView();", drag);
		Actions action=new Actions($driver);
		action.dragAndDropBy(drag, 200, 210).build().perform();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//@Test
	public void droptest() {
		JavascriptExecutor js = (JavascriptExecutor) $driver;
		$driver.findElement(By.linkText("Droppable")).click();
		$driver.switchTo().frame(0);
		WebElement drag=$driver.findElement(By.xpath("//div[@id='draggable' and contains(@class,'ui-widget-content ui-draggable ui-draggable-handle')]"));
		WebElement drop=$driver.findElement(By.id("droppable"));
		js.executeScript("arguments[0].scrollIntoView();", drag);
		Actions action=new Actions($driver);
		action.dragAndDrop(drag, drop).build().perform();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void customdroptest() {
		JavascriptExecutor js = (JavascriptExecutor) $driver;
		$driver.findElement(By.linkText("Droppable")).click();
		$driver.switchTo().frame(0);
		WebElement drag=$driver.findElement(By.id("draggable"));
		WebElement drop=$driver.findElement(By.id("droppable"));
		js.executeScript("arguments[0].scrollIntoView();", drag);
		Actions action=new Actions($driver);
		action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		
}
