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

public class Trading {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://myfno.com/#wall");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'markets')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'stocks')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'options ')]")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id=\"refreshswitch\"]")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@id=\"refreshswitch\"]")).click();
	Thread.sleep(1000);
    Actions aa = new Actions(driver);
    aa.moveToElement(driver.findElement(By.xpath("//i[@class=\"icon-cog2 iconsmall\"]"))).perform();
	Thread.sleep(1000);
    driver.findElement(By.xpath("//a[@class=\"dark\"]")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//a[contains(text(),'light')]")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@class=\"colored\"]")).click();
	Thread.sleep(2000);
    driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(2));
    Actions bb = new Actions(driver);
    bb.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'markets')]"))).perform();
	Thread.sleep(2000);
    List <WebElement> marketoptions=driver.findElements(By.xpath("(//div[@class=\"grp\"])[4]//a"));
    for(WebElement markopt:marketoptions) {
    	wait.until(ExpectedConditions.elementToBeClickable(markopt)).click();
    	wait.withTimeout(Duration.ofSeconds(2));
     }	
 	Thread.sleep(2000);
    Actions cc = new Actions(driver);
    cc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'stocks')]"))).perform();
	Thread.sleep(2000);
    List<WebElement>stocksOptions=driver.findElements(By.xpath("(//div[@class=\"grp\"])[5]//a"));
    for(int i=0; i<=8; i++) {
    	stocksOptions.get(i).click();
    }
	Thread.sleep(2000);
    Actions dd = new Actions(driver);
    dd.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'options ')]"))).perform();
	Thread.sleep(2000);
    List<WebElement>Optiond=driver.findElements(By.xpath("(//div[@class=\"grp\"])[6]//a"));
    for(int i=0; i<=11; i++) {
    	Optiond.get(i).click();
    }
}
}
