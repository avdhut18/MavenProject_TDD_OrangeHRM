package mainjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage extends BaseClass {

	@FindBy(xpath="//*[text()='PIM']")
	WebElement setPIMPage;
	
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement titleOfPimPage;
	
	@FindBy(xpath="//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
	WebElement setEmpId;

	@FindBy(xpath="//button[@type='submit']")
	WebElement clickSearch;
	
	@FindBy(xpath="//*[@class='orangehrm-container']")
	WebElement searchedRecordId;
	
	public PIMPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 06 Feb 2023 
	 * Description : This test method use to click on Pim page   
	 */
	public void clicknPimPageLink() {
		setPIMPage.click();
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 06 Feb 2023 
	 * Description : This test method use to return Pim page text
	 * parameter: String   
	 */
	public String getPimPageTitle() {
		return titleOfPimPage.getText();
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 06 Feb 2023 
	 * Description : This test method use to set emp id  
	 */
	public void setPimPageEmpId(String empId) {
		setEmpId.sendKeys(empId);
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 06 Feb 2023 
	 * Description : This test method use to click search button  
	 */
	public void clickSearchBtn() {
		clickSearch.click();
	}
	
	/*
	 * Author : Avdhut Pawar 
	 * Date : 06 Feb 2023 
	 * Description : This test method use to get emp id from searched results
	 * Parameter: String  
	 */
	public String getEmpIdFromSearchedResults(String empId) {
		clickSearch.click();
		return searchedRecordId.findElements(By.xpath("//div[text()='"+empId+"']")).get(0).getText();
	}
}
