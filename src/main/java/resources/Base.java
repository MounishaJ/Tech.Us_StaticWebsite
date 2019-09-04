package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
		
		public Properties Prop() throws IOException
			{
			prop=new Properties();     // responsible to pull values from data.properties file
			FileInputStream fis=new FileInputStream("F:\\Automation-Selenium\\Static_Website\\src\\main\\java\\resources\\Data.properties");
			prop.load(fis);  //load (data.properties) file into properties object
			return prop;		
			}
		
			public  WebDriver initializeDriver() throws IOException
			{
				
				prop=Prop();  //load (data.properties) file into properties object
				String browserName=prop.getProperty("Browser");
				if(browserName.equals("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
					driver=new ChromeDriver();
					driver.manage().window().maximize();
				}
				else if(browserName.equals("firefox"))
				{
					System.setProperty("webdriver.gecko.driver", "F://Web Drivers/geckodriver.exe");
					 driver=new FirefoxDriver();
					 driver.manage().window().maximize();
				}
				else if(browserName.equals("IE"))
				{
					System.setProperty("webdriver.ie.driver", "F://Web Drivers/MicrosoftWebDriver.exe");
				    driver=new InternetExplorerDriver();
				    driver.manage().window().maximize();
				}
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				return driver;
			}
			
public void pagedata()
{
	
}
}


