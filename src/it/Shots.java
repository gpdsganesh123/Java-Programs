package it;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Shots {
	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver;
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 String link="https://www.skyscanner.co.in/";
		 driver.navigate().to(link);
         Thread.sleep(3000);		
		   
         File FileArc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         String savepath="C:\\Users\\ADMIN\\eclipse-workspace\\Ab\\javaProject\\Screenbabu\\gg.png";
         FileHandler.copy(FileArc,new File(savepath));
        
 
	}
}
