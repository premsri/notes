package org.mv.seleni.MavenPackage;

import org.demo.base.BaseClass;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest extends BaseClass{

	public static void main(String[] args) {
		WebDriver driver = getDriver();
		RegisterPage demo=new RegisterPage();
		setText(demo.getFirstName(), "prem");
		setText(demo.getLastName(), "kumarg");
		click(demo.getRadioBtn());
		click(demo.getCheckBox());
		selectVisible(demo.getCountry(), "India");
		selectVisible(demo.getMon(), "12");
		selectVisible(demo.getYear(), "1993");
		selectVisible(demo.getDate(), "25");
		setText(demo.getMob(), "9987042504");
		setText(demo.getUserName(), "premsri");
		setText(demo.getEmail(), "premsri2504@gmail.com");
		setText(demo.getAboutMe(), "I am Prem Kumar G");
		setText(demo.getPass(), "premsri2504");
		setText(demo.getAgainPass(), "premsri2504");
		
	}
	
}
