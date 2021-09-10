package may_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sameer\\Downloads\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com");
		//driver.navigate().to("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"u_0_2_FX\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("atm.sai@rediffmail.com");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("atma9822");
		//driver.findElement(By.xpath("//*[@id=\"u_0_d_LM\"]")).click();

	}

}
