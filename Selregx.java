package deloitte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selregx {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\geckodriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement radio=driver.findElement(By.xpath("//*[@id='u_0_n']"));
		radio.sendKeys("vamjapratik@gmail.com");
//		String str="NewWorldOrder 2020 vinmar";
		
	}

}
