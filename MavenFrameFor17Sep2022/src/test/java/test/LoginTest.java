package test;

import org.testng.annotations.Test;

import org.testng.Assert;

public class LoginTest extends BaseTest {

	@Test(priority = 0, groups= {"smoke","regression"})
	public void verifyTitleOfLoginPage() {	
		
		String verifyTitleOfLoginPge = loginPage.titleOfLoginPage();
		Assert.assertEquals(verifyTitleOfLoginPge, "Login");
		this.verifyCurrentUrlOfPage();
	}
	
	@Test(priority = 1, groups= {"smoke","regression"})
	public void verifyCurrentUrlOfPage() {
		String verifyUrlOfPage =loginPage.urlOfPage();
		Assert.assertEquals(verifyUrlOfPage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 2, groups= {"smoke","regression"})
	public void verifyLoginWithCorrectCredentials() {
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickLoginBtn();
		String titleOfDash= dashBoardPage.titleOfDashBoardPage();
		Assert.assertEquals(titleOfDash, "Dashboard");
	}
	
	@Test(priority = -1, groups={"smoke","regression"})
	public void verifyBuildTitleName() {
		String verifyTitleOfBuild = loginPage.getBuildTitle();
		Assert.assertEquals(verifyTitleOfBuild, "OrangeHRM");
	}
}
