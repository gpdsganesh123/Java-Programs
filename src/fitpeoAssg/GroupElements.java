package fitpeoAssg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupElements {
public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://fitpeo.com/");
	driver.findElement(By.xpath("//a[@href=\"/revenue-calculator\"]")).click();
	Thread.sleep(2000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	//WebElement slider=driver.findElement(By.xpath("//span[@data-index=\"0\"]"));
	Thread.sleep(2000);
    js.executeScript("window.scrollBy(0,700)");
    
  //first 5 elements clicking
List<WebElement>ceckBoxs=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
 for(int i=0;i<=5;i++) {
	 ceckBoxs.get(i).click();
 }
// Particular clicking elements
int[]forcks= {0,2,7,9};

for(int index :forcks) {
	if(index<ceckBoxs.size()) {
		ceckBoxs.get(index).click();	
		
	}
}
  }
}





