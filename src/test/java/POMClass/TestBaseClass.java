package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBaseClass {
	
	WebDriver driver;
	
	public  TestBaseClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}

}
