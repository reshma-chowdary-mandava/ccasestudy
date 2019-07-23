package cucu_casestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Utilityclass {
	 static WebDriver driver;

		public static WebDriver startBrowser(String browsername,String url)
		{
			
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		        	driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
		}
}
