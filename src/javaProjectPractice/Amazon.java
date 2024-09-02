package javaProjectPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	driver.get("https://www.amazon.in/ref=nav_logo");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realmiMobile",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@src=\"https://m.media-amazon.com/images/I/717DUf0HKPL._AC_UY218_.jpg\"]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//img[@src=\"https://m.media-amazon.com/images/S/al-eu-726f4d26-7fdb/2c90c737-d4e9-4853-9307-9cac1741776a._CR0,0,1200,628_SX507_QL70_.jpg\"]")).click();
	
	JavascriptExecutor js =	(JavascriptExecutor)(driver);
	WebElement mobilename =driver.findElement(By.id("productTitle"));
	js.executeScript("Arguments[0],ScrollIntoView();", mobilename);
	
	}
}
