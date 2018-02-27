package org.util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class BaseClass {

	public WebDriver getDr(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\javapracctise\\SeleniumPractise\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	public void selectVisible(WebElement element, String val) {

		Select sc = new Select(element);
		sc.selectByValue(val);
		element.click();
	}

	public void setText(WebElement element, String name) {
		enableText(element);
		displayText(element);
		if (enableText(element) && displayText(element)) {
			clear(element);
			element.sendKeys(name);
		}

	}

	public void clear(WebElement element) {
		element.clear();

	}

	public void click(WebElement element) {
		element.click();
	}

	public void driverQuit(WebDriver driver) {
		driver.quit();
	}

	public boolean enableText(WebElement element) {
		boolean b = element.isEnabled();
		return b;
	}

	public boolean displayText(WebElement element) {
		boolean b1 = element.isDisplayed();
		return b1;

	}

	public void javascript(WebDriver driver, WebElement element) {

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

	public void label(WebDriver driver, WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
		element.click();
	}

	public void moveOver(WebDriver driver, WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
}
