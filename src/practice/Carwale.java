package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Carwale {
	
	
		WebDriver d;
		@Test
		public void test() throws InterruptedException
		{
			d.get("https://www.carwale.com/social/");
			Actions a=new Actions((WebDriver) d.findElement(By.className("margin-right5")));
	WebElement n=d.findElement(By.linkText("Find New Cars"));
			a.moveToElement(n);
		}
		@BeforeMethod
		public void setup()
		{
			d=new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		@AfterMethod
		public void teardown()
		{
			d.quit();
		}
	
	}
