package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class CreateNewProductPage extends WebDriverUtility {
	//declaration
	@FindBy(xpath = "//input[@name='productname']")
	private WebElement productNameTxtEdt;

	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement vendorNameLkUpImg;

	@FindBy(name = "search_text")
	private WebElement searchTxtEdt;

	@FindBy(name = "search")
	private WebElement searchNowBtn;

	@FindBy(xpath = "//a[text()='madhu']")
	private WebElement vendorNameBtn;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	@FindBy(name = "productcategory")
	private WebElement productCategoryDropdown;
	
	@FindBy(name = "glacct")
	private WebElement glAccountDropdown;
	
	@FindBy(name = "manufacturer")
	private WebElement manufacturerDropdown;
	
	@FindBy(name = "assigned_group_id")
	private WebElement handlerDropdown;
	
	@FindBy(name = "usageunit")
	private WebElement usageunitDropdown;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement groupBtn;
	
	
	//initialization
	public CreateNewProductPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getProductNameTxtEdt() {
		return productNameTxtEdt;
	}

	public WebElement getVendorNameTxtEdt() {
		return vendorNameLkUpImg;
	}

	public WebElement getSearchTxtEdt() {
		return searchTxtEdt;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}

	public WebElement getVendorNameBtn() {
		return vendorNameBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public WebElement getVendorNameLkUpImg() {
		return vendorNameLkUpImg;
	}

	public WebElement getProductCategoryDropdown() {
		return productCategoryDropdown;
	}

	public WebElement getGlAccountDropdown() {
		return glAccountDropdown;
	}

	public WebElement getManufacturerDropdown() {
		return manufacturerDropdown;
	}

	public WebElement getHandlerDropdown() {
		return handlerDropdown;
	}

	public WebElement getUsageunitDropdown() {
		return usageunitDropdown;
	}

	public WebElement getGroupBtn() {
		return groupBtn;
	}

	//business library
	public void enterDataIntoProductPage(String productName,WebDriver driver, String vendorName) {
	productNameTxtEdt.sendKeys(productName);
	vendorNameLkUpImg.click();
	switchToWindow(driver, "Vendors&action");
	searchTxtEdt.sendKeys(vendorName);
	searchNowBtn.click();
	vendorNameBtn.click();
	switchToWindow(driver, "Administrator - Products - vtiger ");
	saveBtn.click();
	}
	
	public void enterDataIntoProductPage1(String productName,String productCategory,String glAccount,String manufacturer,String usageUnit,String handler ) {
		productNameTxtEdt.sendKeys(productName);
		selectDropDownByText(productCategoryDropdown, productCategory);
		selectDropDownByText(glAccountDropdown, glAccount);
		selectDropDownByText(manufacturerDropdown, manufacturer);
		selectDropDownByText(usageunitDropdown, usageUnit);
		groupBtn.click();
		selectDropDownByText(handlerDropdown, handler);
		saveBtn.click();
	}
}
