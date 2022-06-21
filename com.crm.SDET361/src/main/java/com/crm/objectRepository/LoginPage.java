package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(name="user_name")
	private WebElement usernameTxtEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordTxtEdt;
	
	@FindBy(id="submitButton")
	private WebElement submitBtn;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getUsernameTxtEdt() {
		return usernameTxtEdt;
	}

	public WebElement getPasswordTxtEdt() {
		return passwordTxtEdt;
	}
	
	//business libraries
	public void loginToApp(String username,String password)
	{
		usernameTxtEdt.sendKeys(username);
		passwordTxtEdt.sendKeys(password);
		submitBtn.click();
	}
}
