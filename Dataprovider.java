package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dataprovider {

	@Test(dataProvider = "dp", dataProviderClass = DP.class)
	public void LoginFacebook(String username, String pasword) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sameer\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("userid")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pasword);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.close();
	}
}
