import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.util.BaseClass;

public class AmazonGift {

	public static void main(String[] args) {
		BaseClass b =new BaseClass();
		WebDriver driver = b.getDr("https://www.amazon.in");
		WebElement catgeroy = driver.findElement(By.xpath("//span[text()='Category']"));
		b.moveOver(driver, catgeroy);
		WebElement gifts = driver.findElement(By.xpath("//span[contains(text(),'Cards & Mobile')]"));
		b.moveOver(driver, gifts);
		WebElement giftClick = driver.findElement(By.xpath("//span[text()=' All Gift Cards']"));
		b.click(giftClick);
	}
}
