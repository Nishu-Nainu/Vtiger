package com.crm.createDocument;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.CreateNewDocumentPage;
import com.crm.objectRepository.DocumentInfoPage;
import com.crm.objectRepository.DocumentsPage;
import com.crm.objectRepository.HomePage;
public class VtigerCreateDocumentTest extends BaseClass{
	@Test()
	public void createDocumentTest() throws Throwable {
		 int randNum=jLib.getRandomNumber();
		//fetching data from excelsheet
		String documentTitle = eLib.readDataFromExcel("Document", 1, 0)+randNum;
		String groupDropdown = eLib.readDataFromExcel("Document", 3, 1);
		String descriptionBox = eLib.readDataFromExcel("Document", 1, 2);
		
		//clicks on 'Document' 
		HomePage homePage = new HomePage(driver);
		homePage.getDocumentsLnk().click();
		
		//clicks on 'create Document' icon
		DocumentsPage documentPage = new DocumentsPage(driver);
		documentPage.getDocumentLkUpImg().click();
//		System.out.println("please execute");
//		Assert.fail();
		//enters documentTitle with group and description
		CreateNewDocumentPage createNewDocPage = new CreateNewDocumentPage(driver);
		createNewDocPage.enterDataIntoDocumentPage(documentTitle, groupDropdown, descriptionBox);
		
		//validation of document
		DocumentInfoPage docValidation = new DocumentInfoPage(driver);
		String valSuccessful = docValidation.getOnHeaderTxt().getText();
		Assert.assertTrue(valSuccessful.contains(documentTitle));
		System.out.println(documentTitle+"==>created successful");
		
//		if(valSuccessful.contains(documentTitle)) {
//			System.out.println(documentTitle+"==>created successful");
//		}
//		else {
//			System.out.println(documentTitle+"==>not created successful");
//		}
	}
}
//	    driver.findElement(By.xpath("(//td[@class='dvtCellInfo'])[7]")).click();
//	    fileupload("C:\\Users\\Darshan\\eclipse-workspace\\com.crm.SDET35\\src\\test\\resources\\upload\\nudi3.jpg");
		
//	public static void fileupload(String path) throws Throwable {
//		
//		Thread.sleep(1000);
//		StringSelection s = new StringSelection(path);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
//	
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//	
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//	}
