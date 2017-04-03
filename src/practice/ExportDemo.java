package practice;

import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExportDemo {

	WebDriver d;
	@Test
	public void dataExport() throws Exception
	{
	{
		FileOutputStream fos = new FileOutputStream("F:\\SE\\Ashok_Xls.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fos);
		WritableSheet ws=wwb.createSheet("Results",0);
		
		Label l1=new Label(0,0,"QT");
		Label l2=new Label(0,1,"SE");
		Label l3=new Label(0,2,"ETL");
		
		  ws.addCell(l1);
		  ws.addCell(l2);
		  ws.addCell(l3);
		
		wwb.write();
	    wwb.close();
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
