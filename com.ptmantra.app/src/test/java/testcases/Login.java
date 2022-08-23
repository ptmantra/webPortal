package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage;

public class Login extends BaseClass {

	@Test
	public void loginApplication() throws Exception {
		
		logger=report.createTest("Starting loginApplication TestCase ..");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting the Application ..");
		loginPage.loginToPtm(excel.getStringData("login", 0, 0), excel.getStringData("login", 0, 1));
		Thread.sleep(3000);
		logger.pass("Login is successful ..");

	}
	

}
