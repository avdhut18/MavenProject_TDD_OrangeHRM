package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	// All the locators of page
	@FindBy(xpath = "//*[text()='Login']")
	WebElement txtLoginPage;
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(tagName = "button")
	WebElement btnLogin;
	

	// Initialization of locators/variables
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	// methods required to perform test steps
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 04 Feb 2023 
	 * Description : This test method use to verify login page title  
	 * Parameter return : String
	 */

	public String titleOfLoginPage() {
		return txtLoginPage.getText();
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 04 Feb 2023 
	 * Description : This test method use to verify current url of page  
	 * Parameter return : String
	 */
	public String urlOfPage() {
		return driver.getCurrentUrl();
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 04 Feb 2023 
	 * Description : This test method use to set usernameValue  
	 */
	public void setUserName(String usrName) {
		userName.sendKeys(usrName);
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 04 Feb 2023 
	 * Description : This test method use to set passwordValue  
	 */
	public void setPassword(String password) {
		pass.sendKeys(password);
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 04 Feb 2023 
	 * Description : This test method use to click on login button  
	 */
	public void clickLoginBtn() {
		btnLogin.click();
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 04 Feb 2023 
	 * Description : This test method use to get title of build  
	 * parameter : String
	 */
	public String getBuildTitle() {
		return driver.getTitle();
	}

}
