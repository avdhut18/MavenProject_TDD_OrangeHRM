/**
 * 
 */
package extentutility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/*
 * @author Avdhut Pawar
 * @date 2023-03-02
 * @description  
 */
public class CustomRepoeterrrr {

	public static ExtentReports extent;
	
	public static ExtentReports extentReporterGenrator() {
		String path = System.getProperty("user.dir")+"\\Reports\\MavenExtentReport.html";
		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(path);
		extentHtmlReporter.config().setReportName("Regression Test Report");
		extentHtmlReporter.config().setDocumentTitle("Orange Build Report");
		extentHtmlReporter.config().setTheme(Theme.DARK);
		extentHtmlReporter.config().setTimeStampFormat("EEEE,MMMM dd,yyyy, hh:mm a'('zzz')'");
		
		extent = new ExtentReports();
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Org", "Velocity");
		extent.attachReporter(extentHtmlReporter);
		return extent;
	}
}
