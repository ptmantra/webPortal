package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver startUp(WebDriver driver, String browserName, String appURL) {

		if (browserName.equals("Chrome")) {
			System.out.println("Opening Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Chrome Browser is opened ..");
		} else if (browserName.equals("Firefox")) {
			System.out.println("Opening Firefox Browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser is opened ..");
		} else if (browserName.equals("Edge")) {
			System.out.println("Opening Edge Browser");
			WebDriverManager.iedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Edge Browser is opened ..");
		} else if (browserName.equals("Safari")) {
			System.out.println("Opening Safari Browser");
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			System.out.println("Safari Browser is opened ..");
		} else
			System.out.println("Doesn't support this browser");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("Explicit timeouts is set ..");
		driver.manage().window().maximize();
		System.out.println("Maximized the window ..");
		driver.get(appURL);
		System.out.println("Opened the Application .. " + appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Implicit timeouts is set ..");

		return driver;
	}

	public static void tearDown(WebDriver driver) {
		System.out.println("Closing the Browser ..");
		driver.quit();
		System.out.println("Closed the Browser ..");

	}

}
