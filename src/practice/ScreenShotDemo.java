package practice;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotDemo {

	WebDriver d;
	@Test
	//public void test() throws InterruptedException
	//{
		
	//}
	
	public void getScreenshot() throws Exception
	{
		
	try{
	//d.get("http://www.veethi.com/places/india_banks-ifsc-micr-codes.html");
	
	Select Bank=new Select(d.findElement(By.id("selBank")));
	Bank.selectByIndex(3);
    Thread.sleep(3000);
	Select State=new Select(d.findElement(By.id("selState")));
	State.selectByIndex(1);
	Thread.sleep(3000);
	//Select City=new Select(d.findElement(By.id("selCity")));
	//City.selectByVisibleText("Hyderabad");
	Thread.sleep(3000);
	Select Branch=new Select(d.findElement(By.id("selBranch")));
	Branch.selectByIndex(3);
	//return "pass";
	}
	
	
	
	
	catch(Exception e){
		DateFormat dateformate=new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
		Date date = new Date();
		File scrFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("F:\\SE"+dateformate.format(date)+".jpg"));
		
	}
	
	
}

@BeforeMethod
public void setup(){

d= new FirefoxDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
 }

@AfterMethod
public void Teardown(){
	
	//d.quit();
  }

}
