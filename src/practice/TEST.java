package practice;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TEST {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "aq";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get("https://www.carwale.com/new/");
    driver.findElement(By.id("btnNo")).click();
    driver.findElement(By.id("placesQuery")).click();
    driver.findElement(By.xpath("//li[@id='ui-id-16']/a/strong[3]")).click();
    driver.findElement(By.id("placesQuery")).click();
    driver.findElement(By.linkText("Andheri (E), 400059")).click();
    driver.findElement(By.cssSelector("ul.nested-panel-list > li > a")).click();
    driver.findElement(By.cssSelector("span.bodytypesprite.suv")).click();
    driver.findElement(By.id("budget_exp_col")).click();
   // driver.findElement(By.linkText("12-18 lakh")).click();
    driver.findElement(By.linkText("18-25 lakh")).click();
    driver.findElement(By.linkText("25-40 lakh")).click();
  // driver.findElement(By.linkText("12-18 lakh")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
