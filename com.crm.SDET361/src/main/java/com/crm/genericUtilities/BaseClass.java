package com.crm.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver sdriver;
	public	WebDriver driver;
	public DataBaseUtility dLib=new DataBaseUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public JavaUtility jLib=new JavaUtility();
	public FileUtility fLib=new FileUtility();
	public int randNum=jLib.getRandomNumber();
	
	@BeforeSuite(groups = {"smokeTest","functionalTest"})
	public void bdConfig() {
		dLib.connectToDB();
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups = {"smokeTest","functionalTest"})
	public void launchBrowser() throws Throwable {
//		String BROWSER = System.getProperty("browser");
//		String URL = System.getProperty("url");
		String BROWSER = fLib.getPropertyKeyValue("browser");
		String URL = fLib.getPropertyKeyValue("url");
		if(BROWSER.equalsIgnoreCase("firefox")) {
			//WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (BROWSER.equalsIgnoreCase("chrome")) {
			System.setProperty(IConstants.chromeKey, IConstants.chromePath);
			//WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		sdriver=driver;
		driver.manage().window().maximize();
		sdriver.get(URL);
		wLib.waitForPageToLoad(sdriver);
		System.out.println("Browser successfully launched");
	}
	
	@BeforeMethod(groups = {"smokeTest","functionalTest"})
	public void loginToApp() throws Throwable {
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp(USERNAME, PASSWORD);
		System.out.println("login successful");
	}
	
	@AfterMethod(groups = {"smokeTest","functionalTest"})
	public void logOutFromApp() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.logOut(driver);
		System.out.println("logout successful");
	}
	
	@AfterClass(groups = {"smokeTest","functionalTest"})
	public void closeTheBrowser() {
		driver.quit();
		System.out.println("browser closed");
	}
	
	@AfterSuite(groups = {"smokeTest","functionalTest"})
	public void closeDBConfig() {
		dLib.closeDB();
	}
}
