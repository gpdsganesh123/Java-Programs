package javaProjectPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelData {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws Exception {
	WebDriver driver;
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.shopusa.com/in/signup/");
	FileInputStream file=new FileInputStream("");
	 (XSSFWorkbook Workbook = new XSSFWorkbook(file)) {
		XSSFSheet sheet=Workbook.getSheet("sheet2");
		int rowcount=sheet.getLastRowNum();
		int columnCount =sheet.getRow(1).getLastCellNum();
		for(int i=1; i<=rowcount; i++) {
			XSSFRow celldata=sheet.getRow(i);
			
			String mail=celldata.getCell(0).getStringCellValue();
			String createpass=celldata.getCell(2).getStringCellValue();
			String cnfmpass=celldata.getCell(2).getStringCellValue();
			String fullname=celldata.getCell(3).getStringCellValue();
			
			driver.findElement(By.id("FirstName")).sendKeys(fullname);
			driver.findElement(By.id(mail)).sendKeys(mail);
			driver.findElement(By.name("password")).sendKeys(createpass);
			driver.findElement(By.id("confirmpassword")).sendKeys(cnfmpass);
		}
	}
}
}
