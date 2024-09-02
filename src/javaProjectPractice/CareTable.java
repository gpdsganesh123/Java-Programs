package javaProjectPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CareTable {
public static void main(String[] args) throws Exception {
	
	WebDriver driver;
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://kareclouds.com/site/login");
	driver.findElement(By.name("username")).sendKeys("superadmin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Admin@123");
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
    WebElement setup=driver.findElement(By.xpath("//a[@href=\"http://hms.kareclouds.com/\"]"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",setup);
	setup.click();
	driver.findElement(By.xpath("//a[@href=\"http://hms.kareclouds.com/admin/admin/search\"]")).click();
	List<WebElement> names=driver.findElements(By.tagName("//tr[@role=\"row\"]//td[2]"));
	Thread.sleep(3000);
	System.out.println(names.size());
	
	for(WebElement tableone:names) {
		System.out.println(tableone.getText());
	}
	
}
	
	}


