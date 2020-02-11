package in.com.hcl.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Crossbrowser {
	
	WebDriver driver;
	public void BrowserIntialisation() throws IOException {
		//String absolutepath = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream("./file.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browseProperty = prop.getProperty("browser");
		String urlProperty = prop.getProperty("url");
		if(browseProperty.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver1.exe");
			driver=new ChromeDriver();
			driver.get(urlProperty);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		else if(browseProperty.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get(urlProperty);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		else {
			//code for IE
		}
		
	
		
		

}
}