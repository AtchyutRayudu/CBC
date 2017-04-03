package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CommonDemo {
	WebDriver d;
	
	@Parameters("browser")
	
	@BeforeMethod
	public void setup(String browser)
	{
	
	  //lanchbrowser
	if(browser.equals("FF"))
	{
	 d=new FirefoxDriver(); 
	}
	  
	  else if(browser.equals("GC"))
	  {
		  System.setProperty("WebDriver.chrme.driver", "F:\\selenium\\Drivers\\chromedriver.exe");
		  d=new ChromeDriver();
		  
	
	}
	d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
}
	@AfterMethod
	
	public void teardown()
	
	{
		d.close();
	  
	}
	
	

}
