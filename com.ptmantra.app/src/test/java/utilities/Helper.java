package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	public static String captureScreenshot(WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath = System.getProperty("user.dir")+"/Screenshots/ptMantra_"+getCurrentDateTime()+".png";
		try {
			FileHandler.copy(src, new File("./Screenshots/ptMantra_"+getCurrentDateTime()+".png"));
			System.out.println("Screenshot Captured");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to capture screenshot " + e.getMessage());
		}
		return screenshotPath;
	}

	public static String getCurrentDateTime() {
		DateFormat format = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return format.format(currentDate);
	}
	public void handleFrames() {

	}

}
