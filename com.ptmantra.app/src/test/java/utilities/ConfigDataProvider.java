package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		File src = new File("./Config/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to read config file " + e.getMessage());
		}
	}

	public String getDataFromConfig(String keyToSearch) {

		System.out.println("Reading " + keyToSearch + " from Config ..");
		return pro.getProperty(keyToSearch);

	}

	public String getBrowser() {
		System.out.println("Reading Broswer from Config ..");
		return pro.getProperty("Browser");

	}

	public String getURL() {
		System.out.println("Reading URL from Config ..");
		return pro.getProperty("prodURL");
	}

}
