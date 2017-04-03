package run;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GeicoApp {
	WebDriver d;
	@Test
	public void testLogin() throws Exception{
	d.get("http://183.82.118.175:8080/geico-v02/");
	d.findElement(By.name("userName")).sendKeys("admin");
	d.findElement(By.name("password")).sendKeys("test");
	d.findElement(By.className("button1")).click();
	d.findElement(By.xpath("//ul[@id='home']/li[2]/a/h4")).click();
	d.findElement(By.className("button")).click();
	
//Recommended coverage screen 
	Thread.sleep(1000);
	Select state =new Select(d.findElement(By.id("state")));
	state.selectByIndex(33);
	Select ps =new Select(d.findElement(By.id("primaryservice")));
	ps.selectByIndex(1);
	Select os =new Select(d.findElement(By.id("OtherServ")));
	os.selectByIndex(0);
	Thread.sleep(2000);
	d.findElement(By.className("button")).click();
	
	d.findElement(By.name("retailShopsM1")).sendKeys("10000");
	d.findElement(By.name("retailShopsM2")).sendKeys("500");
	d.findElement(By.name("retailShopsM3")).sendKeys("500");
	d.findElement(By.name("retailShopsO1")).sendKeys("100");
	d.findElement(By.name("retailShopsO2")).sendKeys("200");
	d.findElement(By.name("retailShopsO3")).sendKeys("300");
	Thread.sleep(2000);
	d.findElement(By.className("button")).click();
	Thread.sleep(2000);
	
//About You Screen
	
	Select dd =new Select(d.findElement(By.name("title")));
	dd.selectByIndex(1);
	d.findElement(By.name("firstName")).sendKeys("abcd");
	d.findElement(By.name("lastName")).sendKeys("xyz");
	Thread.sleep(2000);
	
//Business Address :
	
	d.findElement(By.name("street")).sendKeys("abcd");
	d.findElement(By.name("secondStreet")).sendKeys("efgh");
	d.findElement(By.name("city")).sendKeys("Newyark");
	d.findElement(By.name("zip")).sendKeys("10001");
	d.findElement(By.name("phone")).sendKeys("9988665544");
	d.findElement(By.name("email")).sendKeys("abcd@gmail.com");
	d.findElement(By.name("squarefeetoccupiedbyyou")).sendKeys("1000");
	
	WebElement radio=d.findElement(By.name("operatedfromhome"));
	 radio.click();
	Select adl =new Select(d.findElement(By.name("additionallocation")));
	adl.selectByIndex(1);
	Select bos =new Select(d.findElement(By.name("businessownership")));
	bos.selectByIndex(1);
	Select noe =new Select(d.findElement(By.name("numofemployees")));
	noe.selectByIndex(9);
	WebElement radio1 = d.findElement(By.name("supplymanufacproducts"));
	radio1.click();
	WebElement radio2 = d.findElement(By.name("tangiblegoodwork"));
	radio2.click();
	Select si =new Select(d.findElement(By.name("similarinsurance")));
	si.selectByIndex(1);
	Thread.sleep(10000);
	//d.findElement(By.className("tcal tcalInput")).sendKeys("01/02/2017");
	//d.findElement(By.className("tcal tcalInput")).sendKeys("01/03/2017");
	
	
//Your Business screen
	 
	 d.findElement(By.name("estmtdpayrollexpense")).sendKeys("10000");
	 d.findElement(By.name("street1")).sendKeys("bbbb");
	 d.findElement(By.name("secondStreet1")).sendKeys("ccccc");
	 d.findElement(By.name("city1")).sendKeys("dddd");
	 d.findElement(By.name("state1")).sendKeys("CA");
	 d.findElement(By.name("zip1")).sendKeys("50001");
	 d.findElement(By.name("squarefeetoccupiedbyyou1")).sendKeys("1000");
	
//Location three
	 
	 d.findElement(By.name("street2")).sendKeys("zzzz");
	 d.findElement(By.name("secondStreet2")).sendKeys("yyyy");
	 d.findElement(By.name("city2")).sendKeys("xxxx");
	 d.findElement(By.name("state2")).sendKeys("NZ");
	 d.findElement(By.name("zip2")).sendKeys("50002");
	 d.findElement(By.name("squarefeetoccupiedbyyou2")).sendKeys("1000");
	 d.findElement(By.className("button")).click();
	 Thread.sleep(3000);
	 d.findElement(By.className("button")).click();
	
   }	
	@BeforeMethod
	public void setUp()
	{
		//Launch browser
		 d = new FirefoxDriver();
		//System.setProperty("webdriver.ie.driver","F:\\Selenium_Scripts_Aug15\\Lib\\IEDriverServer.exe");
		//d=new InternetExplorerDriver();
		//System.setProperty("webdriver.chrome.driver","F:\\Selenium_Scripts_Aug15\\Lib\\chromedriver.exe");
		//d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown(){
		//d.quit();
		
	}
}


