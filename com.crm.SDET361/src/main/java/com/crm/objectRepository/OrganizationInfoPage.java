package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	//declaration
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement onHeaderTxt;
	
	//initialization
	public OrganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getOnHeaderTxt() {
		return onHeaderTxt;
	}
}
//	@FindBy(xpath = "//a[text()='Organization Name']/../../../..//a[@title='Organizations']")
//	private List<WebElement> allOrganizationList;
//	
//	@FindBy(xpath =  "//a[text()='Organizations'][1]")
//	private WebElement organizationsLnk;
//	
//	//initialization
//	public OrganizationInfoPage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
//	
//	public List<WebElement> getAllOrganizationList() {
//		return allOrganizationList;
//	}
//	
//	public void organizationValidation(String OrganizationName) {
//		organizationsLnk.click();
//		int c=0;
//		for( WebElement allOrglist:allOrganizationList) {
//			String allOrg = allOrglist.getText();
//			if(allOrg.equals(OrganizationName)) {
//				System.out.println("organization is created");
//				c=1;
//				break;
//			}
//			if(c==0) {
//				System.out.println("organization is not created");
//			}
//		}
//	}
