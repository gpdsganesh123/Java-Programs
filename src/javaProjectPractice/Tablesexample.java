package javaProjectPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablesexample {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();

	driver.get("https://kareclouds.com/site/login");
	driver.findElement(By.name("username")).sendKeys("superadmin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Admin@123");
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	Thread.sleep(2000);
	WebElement setup=driver.findElement(By.xpath("//a[@href=\"http://hms.kareclouds.com/\"]"));

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",setup);
	setup.click();
    driver.findElement(By.xpath("//a[@href=\"http://hms.kareclouds.com/admin/admin/search\"]")).click();
 
    ///////////////////////////////////////////////////////////////////////
    List<WebElement> ids=driver.findElements(By.xpath("//table[@role=\"grid\"]//tr/td[1]"));
	Thread.sleep(2000);
    System.out.println(ids.size());
    
    int noOfpage=driver.findElements(By.xpath("//span/a")).size();
    
    List<String>Allids=new ArrayList<String>();
    for(int i=0; i<=noOfpage; i++) {
    	if(i==0) {
    		for(WebElement id: ids) {
    			Allids.add(id.getText());
    		}}		
    			else {
    				driver.findElement(By.xpath("//a[@class=\"paginate_button next\"]")).click();
    				ids.add(driver.findElement(By.xpath("//table[@role=\\\"grid\\\"]//tr/td[1]")));
    				for(WebElement id :ids) {
    					Allids.add(id.getText());	 
    			}}}
    for(String v:Allids) {
    	System.out.println(v);
    }}}

