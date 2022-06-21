package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorInfoPage {
	//declaration
			@FindBy(xpath = "//span[@class='lvtHeaderText']")
			private WebElement lvtHeaderTxt;
			
			//initialization
			public VendorInfoPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			//utilization
			public WebElement getlvtHeaderTxt() {
				return lvtHeaderTxt;
			}
		}
//@FindBy(xpath = "//a[text()='Vendor Name']/../../../..//a[@title='Vendors']")
//private List<WebElement> allVendorList;
//
//public VendorInfoPage(WebDriver driver) {
//	PageFactory.initElements(driver, this);
//}
//
//public List<WebElement> getAllVendorList() {
//	return allVendorList;
//}
//
//public void validateVendor(String vendorName){
//	int c=0;
//for(WebElement allVenList:allVendorList) {
//	String allVendor = allVenList.getText();
//	if(allVendor.equals(vendorName)) {
//		System.out.println("vendor is create");
//		c=1;
//		break;
//	}
//	if(c==0) {
//		System.out.println("vendor is not created");
//	}
//}
//}
//}
