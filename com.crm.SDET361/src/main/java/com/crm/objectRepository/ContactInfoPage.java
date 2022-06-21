package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {
	//declaration
		@FindBy(xpath = "//span[@class='dvHeaderText']")
		private WebElement onHeaderTxt;
		
		//initialization
		public ContactInfoPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//utilization
		public WebElement getOnHeaderTxt() {
			return onHeaderTxt;
		}
	}
//	@FindBy(xpath = "//a[text()='First Name']/../../../..//a[@title='Contacts']")
//	private List<WebElement> allContactList;
//	
//
//	//initialization
//	public ContactInfoPage(WebDriver driver) {
//	PageFactory.initElements(driver, this);
//	}
//	
//	public List<WebElement> getAllContactList() {
//		return allContactList;
//	}
//	public void contactValidation(String firstName) {
//		//contactsLnk.click();
//		int c=1;
//		for( WebElement allClist:allContactList) {
//			String allContact = allClist.getText();
//			if(allContact.equals(firstName)) {
//				System.out.println("contact is created");
//				c=0;
//				break;
//			}
//		}
//		if(c==1) {
//			System.out.println("contact is not created");
//		}
//	} 
//}
