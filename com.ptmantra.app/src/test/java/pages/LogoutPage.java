package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {

	WebDriver driver;

	public LogoutPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	Actions a = new Actions(driver);
	@FindBy(xpath = "//*[@id=\"responsive-nav-dropdown\"]")
	WebElement settings;	
	
	@FindBy(xpath = "//a[text()='Log Out']")
	WebElement logoutButton;

	public void logoutFromPtm(WebDriver driver) throws Exception {
		
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			
		}

		a.moveToElement(settings).click().perform();
		logoutButton.click();
		Thread.sleep(5000);
		System.out.println("Logout Successful");

	}

}