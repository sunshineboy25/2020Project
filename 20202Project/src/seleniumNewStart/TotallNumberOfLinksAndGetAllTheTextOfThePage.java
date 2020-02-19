package seleniumNewStart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TotallNumberOfLinksAndGetAllTheTextOfThePage {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// store all the link in Linklist and find Elements(links) of that page by tag name
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		
		// count totall number of links of that page
		int count = linklist.size();
		
		System.out.println(count);
		
		
		// to print all the text of the link of that page
		for(int i=0; i<linklist.size();i++) {
			
		String p = linklist.get(i).getText();
		System.out.println(p);
		
		driver.quit();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
