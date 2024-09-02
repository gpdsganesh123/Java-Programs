package swiggy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParaBank {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver =new ChromeDriver();
		
		String applink="https://parabank.parasoft.com/parabank/index.htm;jsessionid=5AD5CDDAE679C8FEAF459365AE08754B";
		driver.manage().window().maximize();
		driver.navigate().to(applink);
		
         String act=driver.getTitle();
         String Exp="ParaBank | Welcome | Online Banking";
         if(act.equals(Exp)) {
        	 System.out.println("TittleIsMatched");
         }
         else {
         System.out.println("NotMach");
         System.out.println(driver.getTitle());
         }
         Thread.sleep(2000);
         
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("78910");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		Thread.sleep(2000);
		
		
		WebElement errormsg=driver.findElement(By.xpath("//p[@class=\"error\"]"));
		String ExpErrorMsg="The username and password could not be verified.";
		String ActErrorMsg=errormsg.getText();
		if(ExpErrorMsg.equals(ActErrorMsg)) {
		System.out.println("Erroer msg is matched__Msg is:"+ActErrorMsg);
		 }
		 else{
		 	System.out.println("Error msg is not matched");
		 }
		
         driver.findElement(By.xpath("//a[contains(text(),'Admin Page')]")).click();
		 Thread.sleep(2000);
		 
         driver.findElement(By.id("accessMode1")).click();
         
         WebElement drpdown=driver.findElement(By.id("loanProvider"));
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("arguments[0].scrollIntoView();", drpdown);
         
         Select Sc=new Select(drpdown);
         Sc.selectByVisibleText("Web Service");
 		 Thread.sleep(2000);
 		 driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();

 		 WebElement sucessfulmsg=driver.findElement(By.xpath("//p[@style=\"color: #080\"]"));
 		 System.out.println("successfull Saved message is"+sucessfulmsg.getText());
 		 driver.findElement(By.xpath("//a[@href=\"services.htm\"]")).click();
		 Thread.sleep(2000);
		 
		 WebElement table2= driver.findElement(By.xpath("(//td[contains(text(),'Method')])[1]"));
         js.executeScript("arguments[0].scrollIntoView();", table2);
         
         List<WebElement>totalrowAnsColumns= driver.findElements(By.xpath("//table[2]//tr//td"));
         
         int TotalCount=totalrowAnsColumns.size();
         System.out.println("Total Count Of RowsAndColumns is"+TotalCount);
         
         for(WebElement gg :totalrowAnsColumns) {
        	 System.out.println(gg.getText()+" ");
         }
         System.out.println();
         Thread.sleep(2000);
        WebElement onlyheaderData= driver.findElement(By.xpath("//table[2]//tr[1]"));
          System.out.println(onlyheaderData.getText()+"  ");
	}
}
