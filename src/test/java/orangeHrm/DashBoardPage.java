package orangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//h6[text()=\"Dashboard\"]")
	WebElement Dashboard;
	
	
	public boolean dashboardIsEnabled() {
		return Dashboard.isDisplayed();
	}
}
