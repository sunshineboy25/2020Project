package seleniumNewStart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WallpaperDownload {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.pexels.com/search/desktop%20backgrounds/");
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[contains(@alt, 'Snow Capped Mountains Under the Cloudy Skies')]")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Free Download')]")).click();
		
		Thread.sleep(5000);
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
