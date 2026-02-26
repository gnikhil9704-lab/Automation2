package orangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@name=\"username\"]")
	WebElement userName;
	@FindBy (xpath = "//input[@name=\"password\"]")
	WebElement password;
	@FindBy (xpath = "//button[@type=\"submit\"]")
	WebElement logInBtn;
	
	public DashBoardPage logInOrangeHrm (String Username, String Password) {
		userName.sendKeys(Username);
		password.sendKeys(Password);
		logInBtn.click();
		return new DashBoardPage(driver);
	}
	
}
