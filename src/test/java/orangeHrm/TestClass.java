package orangeHrm;

public class TestClass extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.openUrl();
		
		LoginPage lp = new LoginPage(driver);
		DashBoardPage DP = lp.logInOrangeHrm("Admin", "admin123");
		
		if(DP.dashboardIsEnabled()) {
			System.out.println("Login to OrangeHRM is successful");
		}
			
		BaseClass.closeBrowser();
	}

}
