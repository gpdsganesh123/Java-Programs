package javaProjectPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in/ref=nav_logo");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href=\"/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles\"]")).click();
	Thread.sleep(2000);

driver.findElement(By.xpath("//span[contains(text(),'Mobile Broadband Devices')]")).click();
Thread.sleep(3000);
WebElement devicenames=driver.findElement(By.xpath("//span[contains(text(),'Airtel Xstream Wi-Fi Digitaltv Amf-311 Ww 150 Mbps Single_Band Data Card (Black), 4G Hotspot Support with 2300 Mah Battery, Black')]"));
System.out.println(devicenames.getText());
Thread.sleep(2000);
driver.findElement(By.xpath("(//img[@src=\"https://m.media-amazon.com/images/I/61WHqJ0MUeL._AC._SR360,460.jpg\"])[1]")).click();


//int size=devicenames.size();
//System.out.println(size);
//
//for(int i=0; i<=size; i++) {
//	System.out.println(size);
//
//	System.out.println(devicenames);
}

	} 

