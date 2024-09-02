package trade;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T_Hub {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
	driver.navigate().to("https://t-hub.co/");
	Thread.sleep(3000);
	Actions ac =new Actions(driver);
	WebElement about=driver.findElement(By.xpath("(//a[@href=\"/about-us/\"])[1]"));
	ac.moveToElement(about).build().perform();
	for(WebElement ss :opt) {
		wait.until(ExpectedConditions.elementToBeClickable(ss)).click();
		wait.withTimeout(Duration.ofSeconds(2));
}
}
}