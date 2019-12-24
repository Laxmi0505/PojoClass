package org.tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI\\eclipse-workspace\\ReusableClass\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void fill(WebElement e, String value) {
	e.sendKeys(value);
	}
	
	public static void btnClick(WebElement e) {
	e.click();
	}
	
	public static void selectDetail(WebElement e, String details) {
		Select s=new Select(e);
		s.selectByValue(details);
	}
	
	public static String orderId(WebElement e) {
		return e.getAttribute("value");
	}
}