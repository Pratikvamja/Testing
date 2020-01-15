package deloitte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDriven {

	public static void main(String[] args) throws IOException {

		try{
			FileInputStream fi = new FileInputStream("C:\\test\\test.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet sh=wb.getSheetAt(0);
			Row r=sh.getRow(0);
			Cell c=r.getCell(0);
			//System.out.println(c);
			System.setProperty("webdriver.chrome.driver","C:\\geckodriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(c.toString());
			Select dd= new Select(driver.findElement(By.id("day")));
			//System.out.println(dd.getText());
			String value=dd.getFirstSelectedOption().getText();
			c=r.createCell(1);
			//System.out.println(dd.toString());
			c.setCellValue(value);
			fi.close();
			
			FileOutputStream fo = new FileOutputStream("C:\\test\\test.xlsx");
			wb.write(fo);
			fo.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
