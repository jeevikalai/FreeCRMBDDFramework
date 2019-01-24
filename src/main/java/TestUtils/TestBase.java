package TestUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	

	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\jeevi\\seleniumproject\\CucumberFramework\\src\\main\\java\\TestUtils\\config.properties");
		prop.load(fis);
	}
		
	public static void initialization()
	{
			String browsername = prop.getProperty("browser");
			if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chromedriver", "C:\\Users\\jeevi\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			}
			else if (browsername.equals("firefox"))
			{
			 driver = new FirefoxDriver();
			 
			}
			
			String url = prop.getProperty("url");
			System.out.println(url);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			
			
		 

		}
				
}