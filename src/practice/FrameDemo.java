package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameDemo {
	
	WebDriver d;
	@Test
	public void test() throws InterruptedException
	{
		d.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		List<WebElement>f=d.findElements(By.tagName("frame"));
		System.out.println("No of Frames:"+f.size());
		
		d.switchTo().frame(0);
		d.findElement(By.linkText("com.thoughtworks.selenium")).click();
		d.switchTo().defaultContent();
		
		Thread.sleep(3000);
		d.switchTo().frame(1);
		d.findElement(By.linkText("CommandProcessor")).click();
		d.switchTo().defaultContent();
		
		Thread.sleep(3000);
		d.switchTo().frame(2);
		d.findElement(By.linkText("Deprecated Methods")).click();
		d.switchTo().defaultContent();
		
		Thread.sleep(3000);
		d.switchTo().frame(0);
		d.findElement(By.linkText("com.thoughtworks.selenium.condition")).click();
		//d.switchTo().defaultContent();
}
	@BeforeMethod
	public void SetUp()
	{
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.MINUTES);
		
	}
	@AfterMethod
	public void TearDown()
	{
		//d.quit();
	}
}
