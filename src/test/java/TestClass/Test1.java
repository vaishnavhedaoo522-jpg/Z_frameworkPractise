package TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.Browsersetup;
import POMClass.POM1;


public class Test1 extends Browsersetup{

	
	
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		
		POM1 mypom= new POM1(driver);
		mypom.enterUsername();
		Thread.sleep(2000);
		mypom.enterPassword();
		Thread.sleep(2000);
		mypom.clickonlogin();
		
				
	}
}
