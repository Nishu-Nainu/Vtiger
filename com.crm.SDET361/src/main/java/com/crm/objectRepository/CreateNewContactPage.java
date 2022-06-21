package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.genericUtilities.WebDriverUtility;

public class CreateNewContactPage extends WebDriverUtility{
	//declaration
	@FindBy(name = "salutationtype")
	private WebElement firstNameDropDown;
	
	@FindBy(name = "firstname")
	private WebElement firstNameTxtEdt;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTxtEdt;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement createOrgLkpUpImg;
	
	@FindBy(name = "leadsource")
	private WebElement leadSourceDropDown;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement groupBtn;
	
	@FindBy(name = "assigned_group_id")
	private WebElement groupDropDown;
	
	@FindBy(name = "imagename")
	private WebElement uploadBtn;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(name = "search_text")
	public WebElement searchTxtEdt;
	
	@FindBy(name = "search")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//a[.='TYSS']")
	public WebElement clickOnOrgName;
	
//	@FindBy(xpath = "//a[contains(.,'Organization Name')]/../../../..//tr[@class='lvtColData']")
//	public List<WebElement> allOrganizationList;
	
	
	//initialization
	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstNameDropDown() {
		return firstNameDropDown;
	}

	public WebElement getFirstNameTxtEdt() {
		return firstNameTxtEdt;
	}

	public WebElement getLastNameTxtEdt() {
		return lastNameTxtEdt;
	}

	public WebElement getCreateOrgLkpUpImg() {
		return createOrgLkpUpImg;
	}

	public WebElement getLeadSourceDropDown() {
		return leadSourceDropDown;
	}

	public WebElement getGroupBtn() {
		return groupBtn;
	}

	public WebElement getGroupDropDown() {
		return groupDropDown;
	}

	public WebElement getUploadBtn() {
		return uploadBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public WebElement getSearchTxtEdt() {
		return searchTxtEdt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getClickOnOrgName() {
		return clickOnOrgName;
	}
	
//	public List<WebElement> getallOrganizationList() {
//		return allOrganizationList;
//	}
	
	//businessLibraries
	public void enterContactPageInfo(String name,String firstName,WebDriver driver,String lastName,String orgName,String leadSource,String group) throws Throwable {
		selectDropDownByText(firstNameDropDown, name);
		firstNameTxtEdt.sendKeys(firstName);
		lastNameTxtEdt.sendKeys(lastName);
		createOrgLkpUpImg.click();
		takeScreenShot(driver, "createorgLkUpImg");
		switchToWindow(driver, "Accounts&action");
		searchTxtEdt.sendKeys(orgName);
		searchBtn.click();
//		 for(WebElement allOrgList:allOrganizationList) {
//				String allOrg = allOrgList.getText();
//				if(allOrg.equals(orgName)) {
//					allOrgList.click();
//					break;
//				}
//			 }
		clickOnOrgName.click();
		switchToWindow(driver, "Administrator - Contacts - vtiger ");
		selectDropDownByText(leadSourceDropDown, leadSource);
		groupBtn.click();
		selectDropDownByText(groupDropDown, group);
		saveBtn.click();
	}

}
