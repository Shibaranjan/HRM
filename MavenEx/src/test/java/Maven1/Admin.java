package Maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Admin {
	WebDriver ob;
	String bpth="http://apps.qaplanet.in/qahrm/login.php";
  @Test(enabled=true,priority=1,groups="main")
  public void TC_009() {
	  ob.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  ob.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  ob.findElement(By.xpath("//input[@name='Submit']")).click();
	  ob.switchTo().frame("rightMenu");
	  Select sl =new Select(ob.findElement(By.id("loc_code")));
	  sl.selectByIndex(1);
	  
  }
  @BeforeMethod
  public void open() {
	  ob= new ChromeDriver();
	  ob.get(bpth);
  }
  @AfterMethod
  public void close() {
	  
	  ob.quit();
  }
  
}
