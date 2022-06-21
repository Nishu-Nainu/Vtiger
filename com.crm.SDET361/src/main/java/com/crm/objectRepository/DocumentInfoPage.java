package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentInfoPage {
	//declaration
			@FindBy(xpath = "//span[@class='dvHeaderText']")
			private WebElement onHeaderTxt;
			
			//initialization
			public DocumentInfoPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			//utilization
			public WebElement getOnHeaderTxt() {
				return onHeaderTxt;
			}
		}
//@FindBy(xpath = "//a[text()='Title']/../../../..//a[@title='Documents']")
//private List<WebElement> allDocumentList;
//
//public DocumentInfoPage(WebDriver driver) {
//	PageFactory.initElements(driver, this);
//}
//
//public List<WebElement> getAllDocumentList() {
//	return allDocumentList;
//}
//
//public void documentValidation(String documentTitle ) {
//	int d=0;
//	for(WebElement allDocList:allDocumentList) {
//		String allDoc = allDocList.getText();
//		if(allDoc.equals(documentTitle)) {
//			System.out.println("document is created");
//			d=0;
//			break;
//		}
//	}
//	if(d==1) {
//		System.out.println("document is not created");
//	}
//}
//}
