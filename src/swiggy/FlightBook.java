package swiggy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBook {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		String link="https://parabank.parasoft.com/parabank/admin.htm";
		driver.get(link);
		driver.findElement(By.xpath("//input[@id=\"accessMode1\"]")).click();
		
		List <WebElement> Inputfeilds= driver.findElements(By.tagName("//input"));
		
		
		
		System.out.println(Inputfeilds.size());
		Thread.sleep(2000);
		if(Inputfeilds.size()>3) {
			Inputfeilds.get(3).click();
			}
		  else {
			   System.out.println("no find element");
		}
		
	}
}