package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.BaseClass;

public class LoginPage extends BaseClass{

	
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement enterUserName;
	
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement enterPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement login;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
}
