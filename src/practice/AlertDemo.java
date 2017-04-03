package practice;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertDemo extends CommonDemo 
{
	WebDriver d;
	@Test
	public void test() throws InterruptedException
	{
		d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		d.findElement(By.id("usernameId")).sendKeys("abcd");
		d.findElement(By.id("loginbutton")).click();
		Alert al=d.switchTo().alert();
		Thread.sleep(5000);
	    al.getText();
	    Thread.sleep(2000);
		al.accept();
		
	}
	
		
		
		
}
	

