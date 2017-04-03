package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WindowsDemo  {
	
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
	
	



	@Test
	public void test() throws InterruptedException
	{
		d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		d.findElement(By.linkText("Food-on-Track")).click();
		
		Set<String>h=d.getWindowHandles();
		System.out.println("No Of Handles:"+h.size());
		String handle[]=new String[h.size()];
		
		int i=0;
		for(String s:h)
		{
			System.out.println(s);
			handle[i]=s;
			i++;
		}	
		//Thread.sleep(3000);
		//d.findElement(By.xpath("//div[@id='headnavR']/a")).click();
		//Thread.sleep(3000);
		//d.findElement(By.xpath("//ul[@id='main-menu']/li/a")).click();
		
	
		d.switchTo().window(handle[1]);
		d.findElement(By.id("pnrtab")).click();
		Thread.sleep(3000);
		d.switchTo().window(handle[0]);
		d.findElement(By.id("loginbutton")).click();
		
}
	
}


