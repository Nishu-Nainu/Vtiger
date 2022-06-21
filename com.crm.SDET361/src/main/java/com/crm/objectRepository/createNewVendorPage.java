package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createNewVendorPage {
@FindBy(name = "vendorname")
private WebElement vendorNameTxtEdt;

@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement saveBtn;

public createNewVendorPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getVendorNameTxtEdt() {
	return vendorNameTxtEdt;
}

public WebElement getSaveBtn() {
	return saveBtn;
}
public void enterDataIntoVendorPage(String vendorName) {
	vendorNameTxtEdt.sendKeys(vendorName);
	saveBtn.click();
}

}
