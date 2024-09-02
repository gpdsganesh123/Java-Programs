package javaProjectPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingStatement {
	 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver;
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
     driver.get("https://www.shopusa.com/in/shopping/");
     Thread.sleep(2000);
     WebElement shopping=driver.findElement(By.id("scroll-shopping"));
     shopping.click();
     Thread.sleep(2000);
     
     
     JavascriptExecutor js=(JavascriptExecutor)(driver);
     js.executeScript("window.scrollBy(0,500)");
     Thread.sleep(2000);
     WebElement sportsAndoutdoor=driver.findElement(By.id("imagegrid5"));
     sportsAndoutdoor.click();
     
     
     List<WebElement> BrandNames= driver.findElements(By.xpath("//div[@class=\"Sports_and_outdoors shops-list\"]/ul/li"));
     Thread.sleep(1000);
    int size1= BrandNames.size();
     System.out.println(size1);
for (WebElement brands : BrandNames) {
	      String NameDetails=brands.getText();
          Thread.sleep(3000);
	       System.out.println(NameDetails);
	      Thread.sleep(1000);
	      driver.navigate().back();
	      Thread.sleep(1000);
	      js.executeScript("window.scrollBy(0,200)");

	     WebElement homes= driver.findElement(By.xpath("//a[@href=\"/in/shopping/#home_decor\"]"));
	      homes.click();
	      List<WebElement>HomeBrands=driver.findElements(By.xpath("//div[@class=\"Furniture shops-list\"]/ul/li"));
	      int size2=HomeBrands.size();
	      System.out.println(size2);
for (WebElement homebrandnames : HomeBrands) {
	    	String NameDetails2=homebrandnames.getText();
		      Thread.sleep(3000);
	    	System.out.println(NameDetails2);
		      Thread.sleep(3000);
driver.quit();
	    	
		}	
}
}
}
