package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class CreateNewDocumentPage extends WebDriverUtility{
@FindBy(name = "notes_title")
private WebElement documentTitleTxtEdt;

@FindBy(xpath = "//input[@value='T']")
private WebElement groupBtn;

@FindBy(name = "assigned_group_id")
private WebElement groupDropdown;

@FindBy(xpath = "//iframe[@style='width:100%;height:100%']")
private WebElement descriptionTxtEdt;

@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement saveBtn;

public CreateNewDocumentPage(WebDriver driver){
	PageFactory.initElements(driver, this);
	}

public WebElement getDocumentTitleTxtEdt() {
	return documentTitleTxtEdt;
}

public WebElement getDescriptionTxtEdt() {
	return descriptionTxtEdt;
}

public WebElement getSaveBtn() {
	return saveBtn;
}

public WebElement getGroupBtn() {
	return groupBtn;
}


public WebElement getGroupDropdown() {
	return groupDropdown;
}

public void enterDataIntoDocumentPage(String documentTitle,String group,String descriptionBox) {
	documentTitleTxtEdt.sendKeys(documentTitle);
	groupBtn.click();
	selectDropDownByText(groupDropdown, group);
	descriptionTxtEdt.sendKeys(descriptionBox);
	saveBtn.click();
}

}


