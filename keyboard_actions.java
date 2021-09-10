package may_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sameer\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		Actions action=new Actions(driver);
		action.sendKeys(name,"Jack Sparrow").perform();
		action.sendKeys(email,"omkrishna121@gmail.com").perform();
		action.sendKeys(address,"Washington DC, United State of America").perform();
		
		// Keboard Actions
		//1.select text in box using Control+a
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//2. copy text in text box using control+c
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.ENTER).perform();
		//action.click();
		driver.close();
		driver.quit();
		
		

		
		
		

	}

}
