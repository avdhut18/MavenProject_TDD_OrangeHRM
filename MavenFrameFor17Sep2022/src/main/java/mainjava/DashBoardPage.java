package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BaseClass {

	// All the locators of page
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement titleDashBoard;
	
	@FindBy(css=".oxd-userdropdown i")
	WebElement clickLogoutDrpDown;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement txtLogout;
	
	// Initialization of locators/variables
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//all method on page
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 04 Feb 2023 
	 * Description : This test method use to verify dashboard page title  
	 * Parameter return : String
	 */
	public String titleOfDashBoardPage() {
		return titleDashBoard.getText();
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 08 Feb 2023 
	 * Description : This test method use to logout from build  
	 */
	public void logOut() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().refresh();
		clickLogoutDrpDown.click();
		txtLogout.click();
	}
}
