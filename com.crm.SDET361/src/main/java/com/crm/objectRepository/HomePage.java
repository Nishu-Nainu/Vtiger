package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{
	//declaration
	@FindBy(xpath =  "//a[text()='Organizations'][1]")
	private WebElement organizationsLnk;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLnk;
	
	@FindBy(linkText = "Products")
	private WebElement productsLnk;
	
	@FindBy(linkText = "Documents")
	private WebElement documentsLnk;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement moreLnk;
	
	@FindBy(name = "Campaigns")
	private WebElement campaignsLnk;
	
	@FindBy(name = "Vendors")
	private WebElement vendorLnk;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorLnk;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutLnk;
	
	//initialization
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getOrganizationsLnk() {
		return organizationsLnk;
	}

	public WebElement getContactsLnk() {
		return contactsLnk;
	}

	public WebElement getProductsLnk() {
		return productsLnk;
	}

	public WebElement getMoreLnk() {
		return moreLnk;
	}

	public WebElement getAdministratorLnk() {
		return administratorLnk;
	}
	
	public WebElement getCampaignsLnk() {
		return campaignsLnk;
	}

	public WebElement getVendorLnk() {
		return vendorLnk;
	}

	public WebElement getDocumentsLnk() {
		return documentsLnk;
	}

	//business libraries
	public void logOut(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		mouseOverAnElement(driver, administratorLnk);
		signoutLnk.click();
		driver.close();
	}
	
	public void clickOnCampaigns(WebDriver driver) {
		mouseOverAnElement(driver, moreLnk);
		campaignsLnk.click();
	}
	
	public void clickOnVendors(WebDriver driver) {
		mouseOverAnElement(driver, moreLnk);
		vendorLnk.click();
	}
}
