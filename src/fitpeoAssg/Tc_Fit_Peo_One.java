package fitpeoAssg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

    public class Tc_Fit_Peo_One {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://fitpeo.com/");
	driver.findElement(By.xpath("//a[@href=\"/revenue-calculator\"]")).click();
	Thread.sleep(2000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement slider=driver.findElement(By.xpath("//span[@data-index=\"0\"]"));
    Actions act=new Actions(driver);
    act.clickAndHold(slider).moveByOffset((int) 94,0).release().perform();
    js.executeScript("window.scrollBy(0,400)");
    WebElement txt=driver.findElement(By.xpath("//input[@id=\":r0:\"]"));
    Thread.sleep(2000);

    driver.findElement(By.xpath("//input[@id=\":r0:\"]")).sendKeys(Keys.BACK_SPACE); 
    driver.findElement(By.xpath("//input[@id=\":r0:\"]")).sendKeys(Keys.BACK_SPACE); 
    driver.findElement(By.xpath("//input[@id=\":r0:\"]")).sendKeys(Keys.BACK_SPACE); 
	Thread.sleep(2000);	
    driver.findElement(By.xpath("//input[@id=\":r0:\"]")).sendKeys("560"); 

//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//input[@id=\":r0:\"]")).clear();
//    Thread.sleep(2000);
    
    js.executeScript("arguments[0].value='560';", txt);
    js.executeScript("window.scrollBy(0,400)");
    driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
    driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
    driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]")).click();
    driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[8]")).click();
	Thread.sleep(2000);	
    WebElement TotalAmount= driver.findElement(By.xpath("//div[@class=\"MuiBox-root css-m1khva\"]"));
    System.out.println("Total Recurring Reimbursement for all Patients Per Month Amount is" +TotalAmount.getText());
	Thread.sleep(2000);	
    //driver.quit();
	
	
	
	

}
}