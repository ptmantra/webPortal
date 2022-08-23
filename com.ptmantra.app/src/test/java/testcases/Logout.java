package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LogoutPage;

public class Logout extends BaseClass {

	@Test
	public void logoutApplication() throws Exception {

		LogoutPage logoutPage = PageFactory.initElements(driver, LogoutPage.class);
		logoutPage.logoutFromPtm(driver);

	}

}
