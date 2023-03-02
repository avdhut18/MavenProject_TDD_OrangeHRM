package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.BaseClass;
import mainjava.DashBoardPage;
import mainjava.LoginPage;
import mainjava.PIMPage;

public class BaseTest extends BaseClass {

	@BeforeSuite
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--incognito");
//		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--disable-popup-blocking");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@BeforeClass
	public void pageObjects() {
		loginPage = new LoginPage(driver);
		dashBoardPage = new DashBoardPage(driver);
		pimPage = new PIMPage(driver);
	}
	
	@AfterClass
	public void logOutUser() {
		dashBoardPage.logOut();
	}
	
	@AfterSuite
	public void logoutUser() {
		driver.quit();
	}
}
