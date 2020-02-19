package seleniumNewStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverBasics {

	public static void main(String[] args) {
		
		
		
		//WebDriver driver = new WebDriver();
		
	//	System.setProperty("\"webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		
		
		//   WebDriver driver = new FirefoxDriver();
		
	
		
		
		
	// launch google chrome and open google page
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	
	// getting page title
	String title = driver.getTitle();
	System.out.println(title);
	
	
	
	// varifying the title is correct 
	if (title.equals("Google")) {
		System.out.println("Expacted result is matching, so test case passed");
	}else {
		System.out.println("test case failed");
	}
	
	// get the current page URL
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	driver.quit();
	
	
	
	
	
	
		
		
		
		
		
		
	}

}
