package fitpeoAssg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FitPeoRevenueCalculator {
		public static void main(String[] args) throws Exception {
			WebDriver driver;
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://fitpeo.com/");
		
		driver.findElement(By.xpath("//a[@href=\"/revenue-calculator\"]")).click();
		Thread.sleep(2000);	
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);	

	    driver.findElement(By.xpath("//input[@id=\":r0:\"]")).sendKeys(Keys.BACK_SPACE); 
	    driver.findElement(By.xpath("//input[@id=\":r0:\"]")).sendKeys(Keys.BACK_SPACE); 
	    driver.findElement(By.xpath("//input[@id=\":r0:\"]")).sendKeys(Keys.BACK_SPACE); 
		Thread.sleep(2000);	
	    driver.findElement(By.xpath("//input[@id=\":r0:\"]")).sendKeys("560"); 


//	    driver.findElement(By.xpath("//input[@id=\":r0:\"]")).clear();
//		Thread.sleep(2000);
//
//		WebElement txt=driver.findElement(By.xpath("//input[@id=\":ra:\"]"));
//	    Actions aa=new 	 Actions(driver); 
//	    aa.doubleClick(txt);
//		Thread.sleep(2000);	
//	    aa.click(txt);
//	    aa.doubleClick(txt);
		}
		
		
	}