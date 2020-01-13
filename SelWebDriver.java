package deloitte;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;


public class SelWebDriver {

	private static String fileWithPath;
	
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\geckodriver\\chromedriver.exe");
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.netflix.com/in");
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.id("id_userLoginId")).sendKeys("vamjapratik@gmail.com");
//		WebElement chkbox=driver.findElement(By.id("bxid_rememberMe_true"));
//		chkbox.click();
//		if(chkbox.isSelected())
//		{
//			System.out.println("check is on");
//		}
//		driver.get("https://www.facebook.com/campaign/landing.php");
//		WebElement radio=driver.findElement(By.id("u_0_7"));
//		radio.click();
//		if(radio.isSelected())
//		{
//			System.out.println("radio is selected");
//		}
//		driver.get("https://www.facebook.com/campaign/landing.php");
//		Select dropd=new Select(driver.findElement(By.id("day")));
//		dropd.selectByVisibleText("22");
//		Select dropm=new Select(driver.findElement(By.id("month")));
//		dropm.selectByVisibleText("Nov");
//		Select drop=new Select(driver.findElement(By.id("year")));
//		drop.selectByVisibleText("1963");
		
//		driver.get("https://www.facebook.com/campaign/landing.php");
//		driver.findElement(By.cssSelector("#u_0_n")).sendKeys("Pratik");
//		driver.findElement(By.cssSelector("#u_0_p")).sendKeys("Vamja");
		
//		driver.get("https://www.myntra.com/shoe");
//		WebElement radio=driver.findElement(By.xpath(""));
//		radio.click();
//		if(radio.isSelected())
//		{
//			System.out.println("radio is selected");
//		}
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:/Users/ADMIN/Desktop/selenium/error.png"));
		
	}

}
