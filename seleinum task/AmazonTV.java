import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.util.BaseClass;

public class AmazonTV {

	public static void main(String[] args) {
		BaseClass b =new BaseClass();
		WebDriver driver = b.getDr("https://www.amazon.in");
		WebElement catgeroy = driver.findElement(By.xpath("//span[text()='Category']"));
		b.moveOver(driver, catgeroy);
		WebElement tv = driver.findElement(By.xpath("//span[contains(text(),'TV, App')]"));
		b.moveOver(driver, tv);
		WebElement ac = driver.findElement(By.xpath("//span[text()='Air Conditioners']"));
		b.click(ac);
}

}