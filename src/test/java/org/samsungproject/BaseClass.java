package org.samsungproject;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
@BeforeClass
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogesh\\Maven\\FrameWork\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void url(String url) {
		driver.manage().window().maximize();
		driver.get(url);

	}

	public static WebElement findElementByAB(By ab) {
		return driver.findElement(ab);

	}

	public static void data(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void press(WebElement element) {
		element.click();
	}
	public static void check(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static void wait(int a) {
driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
}
	
  public static void fluwait(WebElement element, int a,int b) {
	  Wait<WebDriver> wa = new FluentWait<WebDriver>(driver)
			  .withTimeout(Duration.ofSeconds(a))
			  .pollingEvery(Duration.ofSeconds(b))
			  .withMessage("Not found")
			  .ignoring(NoSuchElementException.class);
	  wa.until(ExpectedConditions.visibilityOf(element));		
  }
	
	
	public static void expWait(WebElement element, int time) {
		Wait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));		
	}
}













