package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public WebDriver driver;

	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginbtn;

	public void setEmail(String emailId) {
		email.clear();
		email.sendKeys(emailId);
	}

	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void clickOnLoginbtn() {
		loginbtn.click();
	}
	
}
