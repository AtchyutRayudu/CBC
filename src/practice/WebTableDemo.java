package practice;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableDemo {
	
	WebDriver d;
	@Test
	public void test() throws InterruptedException{
		d.get("http://aponline.gov.in/apportal/contact/sec_select.asp?sid=1");
		Select s= new Select(d.findElement(By.id("Select1")));
		s.selectByIndex(1);
		
List<WebElement> tr_collection=d.findElements(By.xpath("//table[@id='Table9']/tbody/tr"));
System.out.println("tr_collection:"+tr_collection.size());
List<WebElement> td_collection1=d.findElements(By.xpath("//table[@id='Table9']/tbody/tr/td"));
System.out.println("td_collection:"+td_collection1.size()/tr_collection.size());

int row_num,col_num;
row_num=1;

 for(WebElement trElement:tr_collection){
 List<WebElement>td_collection=trElement.findElements(By.xpath("td"));
 //System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection1.size());
 col_num=1;
 for(WebElement tdElement:td_collection){
	 
	 System.out.println("Row # "+row_num+", Col # "+col_num  + ",Text"+tdElement.getText());
	 col_num++;
  }
 row_num++;
 
  }
 Thread.sleep(2000);
}
	 
//System.out.println("NUMBER OF tdElement:"+tdElement.getText())
 
 
 @BeforeMethod
 
public void setup() throws Exception{
//d=new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"),DesiredCapabilities.firefox());
d= new FirefoxDriver();
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 }

@AfterMethod
public void teardown(){
	
	//d.quit();
  }

}
