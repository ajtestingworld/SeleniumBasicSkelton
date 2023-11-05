package testes;

import org.testng.annotations.Test;

import helper.BaseClass;

public class Tc1 extends BaseClass {
	
	
	
	@Test
	public void verifyLogin()
	{
		
		page.enterUserName.sendKeys("Admin");
		page.enterPassword.sendKeys("admin123");
		page.login.click();
	}

}
