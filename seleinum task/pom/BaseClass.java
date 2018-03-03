package org.demo.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\javapracctise\\SeleniumPractise\\lib\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		return driver;
	}

	public static void setText(WebElement element, String name) {
		enableText(element);
		displayText(element);
		if (enableText(element) && displayText(element)) {
			clear(element);
			element.sendKeys(name);
		}

	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void driverQuit(WebDriver driver) {
		driver.quit();
	}

	public static boolean enableText(WebElement element) {
		boolean b = element.isEnabled();
		return b;
	}

	public static boolean displayText(WebElement element) {
		boolean b1 = element.isDisplayed();
		return b1;

	}

	public void javascript(WebElement element) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			try {
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView(false);", element);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public boolean selected(WebElement element) {
		return element.isSelected();
	}

	public void getAttributeValue(WebElement element) {
		element.getAttribute("value");

	}

	public void label(WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
		element.click();
	}

	public void moveOver(WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void selectVisible(WebElement element, String val) {

		Select sc = new Select(element);
		sc.selectByValue(val);
		element.click();
	}

}
