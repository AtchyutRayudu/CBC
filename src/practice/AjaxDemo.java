package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AjaxDemo extends CommonDemo
{
	WebDriver d;
	@Test
	public void test() throws InterruptedException
	{
		
	d.get("http://www.veethi.com/places/india_banks-ifsc-micr-codes.html");
	
	Select Bank=new Select(d.findElement(By.id("selBank")));
	Bank.selectByIndex(3);
    Thread.sleep(3000);
	Select State=new Select(d.findElement(By.id("selState")));
	State.selectByIndex(1);
	Thread.sleep(3000);
	Select City=new Select(d.findElement(By.id("selCity")));
	City.selectByVisibleText("Hyderabad");
	Thread.sleep(3000);
	Select Branch=new Select(d.findElement(By.id("selBranch")));
	Branch.selectByIndex(3);
	
}



}