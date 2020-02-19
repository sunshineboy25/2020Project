package seleniumNewStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccount  {

	public static void main(String[] args) {
		
		 BaseClass B = new BaseClass();
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(B.PageSource);
		
		
driver.findElement(By.id("firstName")).sendKeys(B.Fname);

driver.findElement(By.name("lastName")).sendKeys(B.Lname);

driver.findElement(By.id("username")).sendKeys(B.user);

driver.findElement(By.name("Passwd")).sendKeys(B.pass);

driver.findElement(By.name("ConfirmPasswd")).sendKeys(B.pass);

driver.findElement(By.id("accountDetailsNext")).click();





		
		
		// driver.quit();
	}

}
