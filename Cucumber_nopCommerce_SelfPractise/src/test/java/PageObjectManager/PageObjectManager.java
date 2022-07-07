package PageObjectManager;

import org.openqa.selenium.WebDriver;

//import PageObjectModel.HomePage;
//import PageObjectModel.LoginPage;
import PageObjectModel.*;

public class PageObjectManager {
	
	public WebDriver driver;
	private LoginPage lp;
	private HomePage hp;
	

	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}


	public LoginPage getInstanceOfLoginPage() {
		
		if(lp==null)
		{
			lp = new LoginPage(driver);
		}
		return lp;
	}


	public HomePage getInstanceOfHomePage() {
		
		if(hp==null)
		{
			hp = new HomePage(driver);
		}
		return hp;
	}
	
}
