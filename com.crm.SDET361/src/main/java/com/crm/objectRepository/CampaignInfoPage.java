package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInfoPage {
	//declaration
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement onHeaderTxt;
	
	//initialization
	public CampaignInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getOnHeaderTxt() {
		return onHeaderTxt;
	}
}
	
//	@FindBy(xpath = "//a[text()='Campaign Name']/../../../..//a[@title='Campaigns']")
//	private List<WebElement> allCampaignList;
//	
//	//initialization
//		public CampaignInfoPage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//		}
//		
//		public List<WebElement> getAllCampaignList() {
//			return allCampaignList;
//		}
//		public void campaignValidation(String campaignName) {
//			int c=0;
//				for( WebElement allCamplist:allCampaignList) {
//					String allCampaign = allCamplist.getText();
//					if(allCampaign.equals(campaignName)) {
//						System.out.println("campaign is created");
//						c=1;
//						break;
//					}
//					if(c==0) {
//						System.out.println("campaign is not created");
//					}
//				}
//			}

