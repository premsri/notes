package co.packag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.util.BaseClass;

public class MouseOver {
	public static void main(String[] args) {
		BaseClass b =new BaseClass();
		WebDriver driver = b.getDr("http://www.greenstechnologys.com/");
		WebElement cou = driver.findElement(By.xpath("//a[text()='COURSES']"));
		b.moveOver(driver, cou);
		WebElement sec = driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
		b.moveOver(driver, sec);
		WebElement thr = driver.findElement(By.xpath("//span[text()='Selenium']"));
		b.click(thr);
	}

}
