package com.crm.createOrganization;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.CreateNewOrganizationPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.OrganizationInfoPage;
import com.crm.objectRepository.OrganizationPage;
public class CreateOrganizationTest extends BaseClass {
	@Test()
	public void createOrganizationTest() throws Throwable {
		 int randNum=jLib.getRandomNumber();
	//fetching data from excelsheet
	String organizationName = eLib.readDataFromExcel("Organization", 1, 2)+randNum;
	String industryName=eLib.readDataFromExcel("Organization", 11, 4);
	String typeName=eLib.readDataFromExcel("Organization", 1, 5);
	String groupName=eLib.readDataFromExcel("Organization", 3, 6);
	String orgName=eLib.readDataFromExcel("Organization", 1, 7);
	
	//clicks on 'Organizations' //clicks on 'Organizations'
	HomePage homePage = new HomePage(driver);
	homePage.getOrganizationsLnk().click();
	
	//clicks on 'create Organizations' icon
	OrganizationPage organizationPage = new OrganizationPage(driver);
	organizationPage.clickOnCreateOrgLkpUpImg();
	
	//enters organization name with industry and type and group
	CreateNewOrganizationPage enterOrgInfo = new CreateNewOrganizationPage(driver);
	enterOrgInfo.enterOrgnaizationInfo(organizationName, industryName, typeName, groupName, orgName, driver);
	
	//validation of organization
	OrganizationInfoPage orgValidation = new OrganizationInfoPage(driver);
	String valSuccessful = orgValidation.getOnHeaderTxt().getText();
	Assert.assertTrue(valSuccessful.contains(organizationName));
	System.out.println(organizationName+"==>created successful");
	
//	if(valSuccessful.contains(organizationName)) {
//		System.out.println(organizationName+"==>created successful");
//	}
	}
}
