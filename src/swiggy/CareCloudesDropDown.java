package swiggy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareCloudesDropDown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
		 driver= new ChromeDriver();
		 driver.get("https://kareclouds.com/site/login");
			driver.findElement(By.name("username")).sendKeys("superadmin@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Admin@123");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href=\"http://hms.kareclouds.com/admin/bloodbankstatus/\"]")).click();
			driver.findElement(By.xpath("//a[@href=\"http://hms.kareclouds.com/admin/bloodbank/issue\"]")).click();
		    driver.findElement(By.xpath("//a[@onclick=\"holdModal('myModal')\"]")).click();
			 List<WebElement> drops=driver.findElements(By.xpath("//ul[@class=\"select2-results__options\"]//li"));
			Thread.sleep(1000);
			
			Select sc =new Select(driver.findElement(By.id("id=\"select2-consultant_doctor-container\"")));
			
              if(drops.size()>2) {
            	  drops.get(2);  
              }
              else {
            	  System.out.println("not Identify");
              }
		    
		    //driver.quit(); this is totally wrong
		 
	}
	
}
