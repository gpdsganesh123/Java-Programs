package handels;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	driver.get("https://shopusa.stgdevserver.com/my-account/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//a[@href=\"https://www.facebook.com/profile.php?id=61556337403401\"])[1]")).click();
	Thread.sleep(3000);
	
	Set<String> s1=driver.getWindowHandles();
	
	Iterator<String> ff=s1.iterator();
	
	String fst=ff.next();  
	
	String scnd =ff.next();
    
	driver.switchTo().window(scnd);
	
    driver.findElement(By.xpath("//input[@id=\":r14:\"]")).sendKeys("1234");

	
	}
}
