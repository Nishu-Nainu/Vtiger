package com.crm.createCampaign;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.CampaignInfoPage;
import com.crm.objectRepository.CampaignPage;
import com.crm.objectRepository.CreateNewCampaignPage;
import com.crm.objectRepository.HomePage;
@Listeners(com.crm.genericUtilities.MyListener.class)
public class CreateCampaignsTest extends BaseClass{
	@Test(retryAnalyzer = com.crm.genericUtilities.RetryAnalyser.class)
	public void createCampaignTest() throws Throwable {
		
		
		String campaignName = eLib.readDataFromExcel("Campaign",1, 2)+randNum;
		String sponser = eLib.readDataFromExcel("Campaign",1, 4);
		String productName = eLib.readDataFromExcel("Product", 1, 2);
		String campaignType = eLib.readDataFromExcel("Campaign",7, 5);
		String campaignStatus = eLib.readDataFromExcel("Campaign",1, 6);
		String groupName=eLib.readDataFromExcel("Organization", 3, 6);

		//mouse over on 'more' button and clicks on 'campaign'
		HomePage homePage = new HomePage(driver);
		homePage.clickOnCampaigns(driver);
		
		//clicks on 'create campaign' icon
		CampaignPage campaignPage = new CampaignPage(driver);
		campaignPage.getCreateCampaignLkUpImg().click();
//		System.out.println("getting fail");
//		Assert.fail();
		
		//enters data into 'create new campaign' page
		CreateNewCampaignPage enterCampaignInfo=new CreateNewCampaignPage(driver);
		enterCampaignInfo.enterCampaignInfo(campaignName, groupName, campaignType, sponser, campaignStatus, productName, driver);
		//System.out.println("getting fail");
		//Assert.fail();
		//performs validation on created 'campaign'
		CampaignInfoPage campaignVal = new CampaignInfoPage(driver);
		String valSuccessfull = campaignVal.getOnHeaderTxt().getText();
		SoftAssert sassert = new SoftAssert();
		sassert.assertTrue(valSuccessfull.contains(campaignName));
		System.out.println(campaignName+"==>created successfully");
		sassert.assertAll();
//		if(valSuccessfull.contains(campaignName)) {
//			System.out.println(campaignName+"==>created successfully");
//		}
//		else {
//			System.out.println(campaignName+"==>not created successfully");
//		}
		}
	}
		
