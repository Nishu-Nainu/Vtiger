package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.genericUtilities.WebDriverUtility;

public class CreateNewOrganizationPage extends WebDriverUtility{
	//declaration
	@FindBy(name = "accountname")
	private WebElement organizationTxtEdt;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy (name = "industry")
	private WebElement industryDropDown;
	
	@FindBy(name = "accounttype")
	private WebElement typeDropDown;
	
	@FindBy(name = "assigned_group_id")
	private WebElement groupDropDown;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement groupBtn;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement memberOfLkpUpImg;
	
	@FindBy(name = "search_text")
	public WebElement searchTxtEdt;
	
	@FindBy(name = "search")
	public WebElement searchBtn;
	
//	@FindBy(xpath = "//a[contains(.,'Organization Name')]/../../../..//tr[@bgcolor='white']")
//	public List<WebElement> allOrganizationList;
	
	@FindBy(xpath = "//a[text()='TYSS']")
	public WebElement clickOnOrgNameBtn;
	
	//initialization
	public CreateNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getOrganizationTxtEdt() {
		return organizationTxtEdt;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getTypeDropDown() {
		return typeDropDown;
	}
	
	public WebElement getGroupDropDown() {
		return groupDropDown;
	}
 
	 public WebElement getSearchTxtEdt() {
		return searchTxtEdt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getClickOnOrgNameBtn() {
		return clickOnOrgNameBtn;
	}
	
//	public List<WebElement> getallOrganizationList() {
//		return allOrganizationList;
//	}

	public WebElement getMemberOfLkpUpImg() {
		return memberOfLkpUpImg;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getGroupBtn() {
		return groupBtn;
	}
	
//	public List<WebElement> getallOrganizationList() {
//		return allOrganizationList;
//	}
	

	//busisness library
	public void enterOrgnaizationInfo(String organizationName, String industry,String type,String group,String orgName, WebDriver driver)
	 {
		 organizationTxtEdt.sendKeys(organizationName);
		 memberOfLkpUpImg.click();
		 switchToWindow(driver, "Accounts&action");
		 searchTxtEdt.sendKeys(orgName);
		 searchBtn.click();
//		 //waitForElementToBeClickable(driver, searchBtn);
//		 for(WebElement allOrgList:allOrganizationList) {
//			String allOrg = allOrgList.getText();
//			if(allOrg.contains(orgName)) {
//				allOrgList.click();
//				break;
//			}
//		 }
		 clickOnOrgNameBtn.click();
		 switchToAlertPopUpAndAccept(driver);
		 switchToWindow(driver, "Administrator - Organizations - vtiger");
		 selectDropDownByText(industryDropDown, industry);
		 selectDropDownByText(typeDropDown, type);
		 groupBtn.click();
		 selectDropDownByText(groupDropDown, group);
		 saveBtn.click();
	 }
}
