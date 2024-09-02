package javaProjectPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {
	
public static void main(String[] args) {
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://kareclouds.com/site/login");
driver.findElement(By.name("username")).sendKeys("superadmin@gmail.com");
driver.findElement(By.id("password")).sendKeys("Admin@123");
driver.findElement(By.xpath("//button[text()='Sign In']")).click();
boolean tle=driver.findElement(By.xpath("//span[contains(text(),'Kareclouds Hospital & Research Center')]")).isDisplayed();
if(tle=true) {
	System.out.println("TittleIsmatched");
}
else {
	System.out.println("not match");
}
driver.findElement(By.xpath("//a[@href=\"http://hms.kareclouds.com/admin/radio/search\"]")).click();
System.out.println("RadiobuttonClicked");

//List<WebElement> table=driver.findElements(By.xpath("//section[@class=\"content\"]"));
//WebElement k;
//for(int i = 0; i<table.size();i++) {
//	k=table.get(i);
//			System.out.println(k.getText());
//}
driver.findElement(By.xpath("//span[text()='TPA Management']")).click();
List <WebElement> table2=driver.findElements(By.xpath("//div[@class=\"box box-primary\"]"));
int rCount=table2.size();
System.out.println(rCount);
int cCount=table2.size();
System.out.println(cCount);
for(int r=1; r<rCount; r++) {
	for(int c=1; c<cCount; c++) {
		
	}
}
driver.findElement(By.xpath("(//a[@href=\"http://hms.kareclouds.com/admin/calendar/events\"])[1]")).click();
System.out.println("date button is clicked");
driver.findElement(By.xpath("//div[@class=\"box-tools pull-right\"]")).click();

WebElement dd=driver.findElement(By.id("addtodo_formbtn"));

	
}
}

		
	
	

	


