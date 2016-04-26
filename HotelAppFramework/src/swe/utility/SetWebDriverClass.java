package swe.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SetWebDriverClass {
	
	WebDriver driver = null;
	String strExePath;
		
	//set property
	public void setPropertyforChrome(){
		strExePath = "C:\\Sweta\\Selenium\\chromedriver_win32\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver", strExePath);
	}
	
	//instatiate chrome driver
	public WebDriver createDriverChrome(){
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebDriver createDriverFireFox(){
		return driver = new FirefoxDriver();
	}
	
	public WebDriver createDriverIE(){
		return driver = new InternetExplorerDriver();
	}
}
