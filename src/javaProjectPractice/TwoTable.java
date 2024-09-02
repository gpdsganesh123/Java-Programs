package javaProjectPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoTable {
public static void main(String[] args) throws InterruptedException {
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
Thread.sleep(2000);
List<WebElement> tabledat= driver.findElements(By.xpath("//table[@role='grid']//tbody/tr/td[1]"));
for(WebElement gg:tabledat) {
	System.out.println(gg.getText());
}

}
//List<WebElement> uu= driver.findElements(By.xpath("//div[@class=\"col-md-12\"]"));
//for(WebElement t:uu) {
//	System.out.println(t.getText());}
//List<WebElement> tab=driver.findElements(By.xpath("//table//tr[@role='row']"));
//int aa=tab.size();
//List<WebElement> tabledate= driver.findElements(By.xpath("//table[@role=\"grid\"]//tbody/tr/td"));
//for(WebElement g:tabledate) {
//	System.out.println(g.getText());
//	

//int rowc=tabledate.size();
//System.out.println(rowc);
//int columnc=tabledate.size();
//System.out.println(columnc);
}

