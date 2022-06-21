package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	//declaration
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createContactsLkpUpImg;

	//initialization
	public ContactsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCreateContactsLkpUpImg() {
		return createContactsLkpUpImg;
	}

	//business Libraries
	public void clickOnContactLkpUpImg() {
	createContactsLkpUpImg.click();
	}
}
