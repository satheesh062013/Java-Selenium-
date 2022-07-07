package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import PageObjectManager.PageObjectManager;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;

public class Steps extends BaseClass {
	
	WebDriver driver;
	
	public PageObjectManager pom;

	@Given("User launches the Browser {string}")
	public void user_launches_the(String browserName) throws Exception {
		driver = launchBrowser(browserName);
		pom = new PageObjectManager(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("user opens the URL with {string}")
	public void user_opens_the_URL_with(String url) {
		launchUrl(url);
	}

	@Then("verify the PageTitle with {string}")
	public void verify_the_PageTitle_with(String title) {
	 
		if(driver.getTitle().equals(title))
		{
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}

	@Then("user passes the Username {string} and password {string}")
	public void user_passes_the_Username_and_password(String email, String password) {
		pom.getInstanceOfLoginPage().setEmail(email);
		pom.getInstanceOfLoginPage().setPassword(password);
	}
	
	@Then("click on the LoginButton")
	public void click_on_the_LoginButton() {
	   pom.getInstanceOfLoginPage().clickOnLoginbtn();
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}
	
	@Then("click on the LogoutButton")
	public void click_on_the_LogoutButton() {
	   pom.getInstanceOfHomePage().clickOnLogOutbtn();
	}


}
