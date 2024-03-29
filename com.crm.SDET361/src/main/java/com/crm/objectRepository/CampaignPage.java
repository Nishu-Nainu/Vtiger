package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	//declaration
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private WebElement createCampaignLkUpImg;

	//initialization
	public CampaignPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCreateCampaignLkUpImg() {
	return createCampaignLkUpImg;
	}
}
