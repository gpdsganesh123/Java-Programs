package fitpeoAssg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OneMorsElementS {
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver;
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
driver.get("https://fitpeo.com/");
driver.findElement(By.xpath("//a[@href=\"/revenue-calculator\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]")).click();
Thread.sleep(1000);
WebElement TxT=driver.findElement(By.id(":r0:"));
Thread.sleep(1000);
JavascriptExecutor ja=(JavascriptExecutor)(driver);

ja.executeScript("arguments[0].scrollIntoView()",TxT);
Thread.sleep(1000);


WebElement slider=driver.findElement(By.xpath("(//input[@min=\"0\"])[1]"));
WebElement twooo=driver.findElement(By.xpath("//input[@aria-valuenow=\"200\"]"));
Thread.sleep(1000);

WebElement target=driver.findElement(By.xpath("//input[@aria-valuenow=\"820\"]"));
Thread.sleep(1000);

Actions ac=new Actions(driver);

ac.clickAndHold(slider).moveToElement(target).release(target).build().perform();



int slidewdth=slider.getSize().getWidth();


int minval=0;
int maxval=2000;
double targetval=93.56;

//double  pxlvalue=(double)slidewdth/(maxval-minval);
//int xoffset=(int)((targetval-minval)*pxlvalue);







List<WebElement> txtbx=driver.findElements(By.xpath("//input[@data-indeterminate=\"false\"]"));
Thread.sleep(1000);
int cunt=txtbx.size();
 System.out.println(cunt);
int[]gg= {1,3,5,7,9,11};
for(int ghani :gg) {
	if(ghani<txtbx.size());
	txtbx.get(ghani).click();
}
 




}
}