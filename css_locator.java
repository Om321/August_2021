package may_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sameer\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//css selector using id using # operator
		//driver.findElement(By.cssSelector("input#email")).sendKeys("8208307821");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
		//css selector using class name using dot operator
		//driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("8208307821");
		//driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("23145");
		//driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
		//driver.findElement(By.cssSelector("button._42ft")).click();	
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("8407936357");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("123456");
	}

}
