package javaProjectPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Population {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.worldometers.info/world-population/");
		//List<WebElement> Lieve=driver.findElements(By.xpath("//div[@class=\"maincounter-number\"]//span"));

		//  int q=0;
	//	    while(true) {
		
//			List<WebElement> Lieve=driver.findElements(By.xpath("//div[@class=\"maincounter-number\"]"));
//			int cc=Lieve.size();
//		    for(int i=0; i<=cc; i++) {
//          System.out.println(cc);
//			

		List<WebElement> totalDasta=driver.findElements(By.xpath("//div[@class=\"col-sm-6\"]/div"));
	int tabledata=totalDasta.size();
	for(int a=0; a<=tabledata; a++) {
		List<WebElement> totalDastaa=driver.findElements(By.xpath("//div[@class=\"col-sm-6\"]/div"));
		System.out.println(totalDasta);
		System.out.println(totalDasta);

	}
		          
		
	
		
		
			}
			}
