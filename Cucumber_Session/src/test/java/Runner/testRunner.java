package Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass_AdactinPages_Mini_Proj.BaseClass_Adactin;
import com.Properties.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	( 
		
		features = "C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Cucumber_Session\\src\\test\\java\\Features\\AdactinHotelBooking.feature",
		glue = "stepDefinitions",
		monochrome = true,
		dryRun = false,
		/*strict = true,*/
		tags = {"@Test"},
		plugin = {//Report Generation
				"html:Report",//Create index.html report under Report Folder
				"json:Report/cucumber.json", //Create cucumber.json file under Report Folder
				"html:target/cucumber.html", //Create index.html report under target & then cucumber Folder
				"pretty",					 // Report will be pretty
				"com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin.html"//ExtentReport Create underReportFolder
				}	
	)

public class testRunner 
{
	
	@BeforeClass
	public static void setup() throws IOException
	{
		BaseClass_Adactin.driver = BaseClass_Adactin.launchBrowser(File_Reader_Manager.getInstanceFRM().getInstanceCR().getbrowserName());
	}
	
	@AfterClass
	public static void tearDown() throws InterruptedException
	{
		BaseClass_Adactin.closeWindow();
	}

}
