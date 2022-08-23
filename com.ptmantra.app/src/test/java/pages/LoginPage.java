package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(name = "username")
	WebElement uName;
	@FindBy(name = "password")
	WebElement pass;
	@FindBy(xpath = "//*[@data-testid=\"submit-button\"]")
	WebElement loginButton;

//	Actions a = new Actions(driver);
//	@FindBy(xpath = "//*[@id=\"responsive-nav-dropdown\"]")
//	WebElement settings;
//
//	@FindBy(xpath = "//a[text()='Log Out']")
//	WebElement logoutButton;

	public void loginToPtm(String userName, String password) throws Exception {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}

		uName.sendKeys(userName);
		pass.sendKeys(password);
		loginButton.click();
		Thread.sleep(5000);
		System.out.println("Login Successful");

	}

//	public void logoutFromPtm() throws Exception {
//
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//
//		}
//
//		a.moveToElement(settings).click().perform();
//		logoutButton.click();
//		Thread.sleep(5000);
//		System.out.println("Logout Successful");
//
//	}
}
