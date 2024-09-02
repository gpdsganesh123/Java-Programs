package javaProjectPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_head {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	driver.get("https://kareclouds.com/site/login");
	driver.findElement(By.name("username")).sendKeys("superadmin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Admin@123");
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	Thread.sleep(2000);
	WebElement setup=driver.findElement(By.xpath("//a[@href=\"http://hms.kareclouds.com/\"]"));

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",setup);
	setup.click();
    driver.findElement(By.xpath("//a[@href=\"http://hms.kareclouds.com/admin/admin/search\"]")).click();
   List<WebElement> thead=driver.findElements(By.xpath("//table[@role='grid']//tr/td[2]"));
   System.out.println(thead.size());
  Thread.sleep(2000);
	for(WebElement Hdata:thead) {
		System.out.println(Hdata.getText());
		Thread.sleep(2000);
		WebElement second=driver.findElement(By.xpath("(//a[@aria-controls=\"DataTables_Table_0\"])[9]"));
		js.executeScript("arguments[0].scrollIntoView();",second);
		second.click();
		List<WebElement>tab2=driver.findElements(By.xpath("//table[@role='grid']//tr//td[2]"));
		Thread.sleep(2000);
		System.out.println(tab2.size());
		Thread.sleep(2000);
	for(WebElement tt2:tab2) {
		System.out.println(tt2.getText());
		
	}
	}
	}
	}



