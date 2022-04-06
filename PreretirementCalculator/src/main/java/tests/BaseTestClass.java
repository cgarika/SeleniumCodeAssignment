package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.HomePage;

public class BaseTestClass {

	protected static WebDriver driver;

	public static WebDriver StartBrowser(String browsername, String url) {
		// If the browser is Firefox
		if (browsername.equalsIgnoreCase("Firefox")) {
			// Set the path for geckodriver.exe
			System.setProperty("webdriver.firefox.marionette", "/Users/chanu/Documents/GitHub/SeleniumFrameWorkDesign/PreretirementCalculator/geckodriver");
			driver = new FirefoxDriver();
		}

		// If the browser is Chrome
		else if (browsername.equalsIgnoreCase("Chrome")) {
			// Set the path for chromedriver.exe
			System.setProperty("webdriver.chrome.driver", "/Users/chanu/Documents/GitHub/SeleniumFrameWorkDesign/PreretirementCalculator/chromedriver");
			driver = new ChromeDriver();
		}
		// If the browser is IE
		else if (browsername.equalsIgnoreCase("IE")) {
			// Set the path for IEdriver.exe
			System.setProperty("webdriver.ie.driver", "E://Selenium//Selenium_Jars//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
		return driver;

	}

}
