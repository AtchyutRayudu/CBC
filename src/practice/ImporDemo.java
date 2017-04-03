package practice;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;

public class ImporDemo {
	
	WebDriver d;
	@Test
	public void dataExport() throws Exception
	{
	{
		d.get("https://www.google.co.in/?gws_rd=ssl");
		d.findElement(By.id("lst-ib")).sendKeys("PedaRayudu");
		d.findElement(By.id("lst-ib")).clear();
		FileInputStream fis = new FileInputStream("F:\\SE\\Rayudu_Xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s=wb.getSheet(0);
		for(int i=0;i<s.getRows();i++);
		
		 d.findElement(By.id("lst-ib")).clear();
		 d.findElement(By.id("lst-ib")).sendKeys(s.getCell(0,1).getContents());
		
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
