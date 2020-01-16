package Redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRedbus {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\geckodriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		WebElement src = driver.findElement(By.id("src"));
		src.sendKeys("Borivali");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.className("selected")).click();
		src.sendKeys(Keys.ENTER);
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("Majestic");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.className("selected")).click();
		dest.sendKeys(Keys.ENTER);
		dest.sendKeys(Keys.TAB);
		//for date
		driver.findElement(By.xpath("//html//body//div[6]//table//tbody//tr[5]//td[4]")).click();
		//for click search
		driver.findElement(By.xpath("//html//body//section//div[2]//main//section//div//div[2]//section//div//button")).click();
		//for view seats
//		TimeUnit.SECONDS.sleep(1);
		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/div/div[2]/div[2]/div[2]/ul[1]/div[1]/li/div/div[2]/div[1]")).click();
		WebElement view = driver.findElement(By.xpath("//*[@id='13436002']/div/div[2]/div[1]"));
		String str=view.getText();
		view.click();
		System.out.println(str);
		Thread.sleep(200);
//		TimeUnit.SECONDS.sleep(5);
//		//for bus pic
		driver.findElement(By.xpath("//html//body//section//div[2]//div[1]//div//div[2]//div[2]//div[2]//ul[1]//div[1]//li//div//div[2]//div[2]//ul//li[2]//span")).click();
	}

}
