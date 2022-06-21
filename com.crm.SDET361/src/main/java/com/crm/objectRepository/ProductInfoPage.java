package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class ProductInfoPage extends WebDriverUtility {
	//declaration
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement lvtHeaderTxt;
	
	@FindBy(xpath = "//a[text()='Product Name']/../../../..//a[@title='Products']")
	private List<WebElement> allProductList;
	
	@FindBy(xpath = "//input[@title='Delete [Alt+D]']")
	private WebElement deleteBtn;
	
	@FindBy(xpath = "//img[@value='Previous']")
	private WebElement previousBtn;
	
	@FindBy(xpath = "//img[@title='Next']")
	private WebElement forwardBtn;
	
	@FindBy(xpath = "//a[text()='Go to Advanced Search']")
	private WebElement advanceSearchBtn;
	
	//initialization
		public ProductInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		
		//utilization
		
		
		public List<WebElement> getAllProductList() {
			return allProductList;
		}
		
		public WebElement getLvtHeaderTxt() {
			return lvtHeaderTxt;
		}

		public WebElement getDeleteBtn() {
			return deleteBtn;
		}

		public WebElement getPreviousBtn() {
			return previousBtn;
		}

		public WebElement getForwardBtn() {
			return forwardBtn;
		}

		public WebElement getAdvanceSearchBtn() {
			return advanceSearchBtn;
		}

//		public void productValidation(String productName) {
//			//productsLnk.click();
//			int p=0;
//			for( WebElement allProductlist:allProductList) {
//				String allProduct = allProductlist.getText();
//				if(allProduct.equals(productName)) {
//					System.out.println("product is created");
//					p=0;
//					break;
//				}
//				if(p==1) {
//					System.out.println("product is not craeted");
//				}
//			}
//		}
//		
		public void productInfo(String productName,WebDriver driver) {
			//productsLnk.click();
			for( WebElement allProductlist:allProductList) {
				String allProduct = allProductlist.getText();
				if(allProduct.equals(productName)) {
					allProductlist.click();
					break;
				}
			}
		deleteBtn.click();
		switchToAlertPopUpAndAccept(driver);
		}
		
		public void productInfo1(String productName,WebDriver driver) {
			//productsLnk.click();
			for( WebElement allProductlist:allProductList) {
				String allProduct = allProductlist.getText();
				if(allProduct.equals(productName)) {
					allProductlist.click();
					System.out.println(productName);
					break;
				}
			}
			previousBtn.click();
		}
		public void productInfo2(String productName,WebDriver driver) {
			//productsLnk.click();
			for( WebElement allProductlist:allProductList) {
				String allProduct = allProductlist.getText();
				if(allProduct.equals(productName)) {
					allProductlist.click();
					System.out.println(productName);
					break;
				}
			}
			forwardBtn.click();
		}
		public void productInfo3(String productName,WebDriver driver) {
			advanceSearchBtn.click();
		}

}
