package swiggy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NinjaTuturiotal {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		String link="https://tutorialsninja.com/demo/index.php?route=common/home";
		driver.get(link);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"https://tutorialsninja.com/demo/index.php?route=product/category&path=24\"]")).click();
}

}