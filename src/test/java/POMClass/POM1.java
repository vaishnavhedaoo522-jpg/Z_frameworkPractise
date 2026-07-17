package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM1  extends TestBaseClass{
	
	

	public POM1(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='username']") private WebElement Username;
	@FindBy(xpath="//input[@id='password']") private WebElement Password;
	@FindBy(xpath="(//*[text()='Submit'])[1]")private WebElement loginbutton;
	
	
	
	public void enterUsername()
	{
		Username.sendKeys("student");
	}
	
	
	public void enterPassword()
	{
		Password.sendKeys("Password123");
	}
	
	public void clickonlogin()
	{
		loginbutton.click();
	}
	
	
}
