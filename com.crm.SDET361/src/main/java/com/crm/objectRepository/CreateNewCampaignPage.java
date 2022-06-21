package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.genericUtilities.WebDriverUtility;

public class CreateNewCampaignPage extends WebDriverUtility {
	//declaration
	@FindBy(name = "campaignname")
	private WebElement campaignNameTxtEdt;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement groupBtn;
	
	@FindBy(name = "assigned_group_id")
	private WebElement groupDropDown;
	
	@FindBy(name = "campaigntype")
	private WebElement campaignTypeDropDown;
	
	@FindBy(name = "sponsor")
	private WebElement sponserTxtEdt;
	
	@FindBy(name = "campaignstatus")
	private WebElement campaignStatusDropDown;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement createProductLkUpImg;
	
	@FindBy(name = "search_text")
	private WebElement searchTextTxtEdt;
	
	@FindBy(name = "search")
	private WebElement searchNowBtn;
	
	@FindBy(xpath = "//a[text()='samsung']")
	private WebElement productNameBtn;
	
	@FindBy(xpath = "//textarea[@class='detailedViewTextBox']")
	private WebElement descriptionBoxTxtEdt;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
//	@FindBy(xpath = "//a[contains(.,'Product Name')]/../../../..//tr[@class='lvtColData']")
//	public List<WebElement> allProductList;
	
	//initialization
    public CreateNewCampaignPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    	}

    //utilization
	public WebElement getCampaignNameTxtEdt() {
		return campaignNameTxtEdt;
	}

	public WebElement getGroupBtn() {
		return groupBtn;
	}

	public WebElement getGroupDropDown() {
		return groupDropDown;
	}

	public WebElement getCampaignTypeDropDown() {
		return campaignTypeDropDown;
	}

	public WebElement getSponserTxtEdt() {
		return sponserTxtEdt;
	}

	public WebElement getCampaignStatusDropDown() {
		return campaignStatusDropDown;
	}

	public WebElement getCreateProductLkUpImg() {
		return createProductLkUpImg;
	}

	public WebElement getSearchTextTxtEdt() {
		return searchTextTxtEdt;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}

	public WebElement getProductNameBtn() {
		return productNameBtn;
	}

	public WebElement getDescriptionBoxTxtEdt() {
		return descriptionBoxTxtEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
//	public List<WebElement> getallProductList() {
//		return allProductList;
//	}
//    
	//business library
    public void enterCampaignInfo(String campaignName,String group,String campaignType,String sponser,String campaignStatus,String productName,WebDriver driver) throws InterruptedException {
    	campaignNameTxtEdt.sendKeys(campaignName);
    	groupBtn.click();
    	selectDropDownByText(groupDropDown, group);
    	selectDropDownByText(campaignTypeDropDown, campaignType);
    	sponserTxtEdt.sendKeys(sponser);
    	selectDropDownByText(campaignStatusDropDown, campaignStatus);
    	createProductLkUpImg.click();
    	switchToWindow(driver, "Products&action");
    	searchTextTxtEdt.sendKeys(productName);
    	searchNowBtn.click();
//    	for(WebElement allProList:allProductList) {
//			String allPro = allProList.getText();
//			if(allPro.equals(productName)) {
//				allProList.click();
//				break;
//			}
//		 }
    	productNameBtn.click();
    	switchToWindow(driver, "Administrator - Campaigns");
    	descriptionBoxTxtEdt.sendKeys("campaign started");
    	saveBtn.click();
    	Thread.sleep(3000);
    }
    
   }
