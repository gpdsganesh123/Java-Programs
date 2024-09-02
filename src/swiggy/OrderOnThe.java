package swiggy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderOnThe {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver;
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	String link="https://www.swiggy.com/";
	driver.get(link);
	
  List <WebElement> NumOfIteams=driver.findElements(By.xpath("//img[@class=\"sc-kAyceB eDtXYp\"]"));
 Thread.sleep(1000);
   if(NumOfIteams.size()>5) {
	   Thread.sleep(3000);
	 NumOfIteams.get(5).click(); 
   }
   else {
	   System.out.println("element on find");
   }
  }
  
}
