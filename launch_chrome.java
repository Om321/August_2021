package may_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sameer\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://accounts.google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8208307821");
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("omkrishna121@gmail.com");
		driver.findElement(By.xpath("//*[@name=\"Next\"]")).click();//("//*[@id=\"identifierNext\"]/div/button/span");
		
		//driver.close();

	}

}
