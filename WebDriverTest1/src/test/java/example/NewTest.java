package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  public static String url="http://newtours.demoaut.com/";
  WebDriver driver = new FirefoxDriver();
  @Test   
  public void f() {
  driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("tutorial");
  driver.findElement(By.xpath("//*[contains(@name,'password')]")).sendKeys("tutorial");
  driver.findElement(By.xpath("//*[contains(@name,'login')]")).click();
  Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
  driver.get(url);
  Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
  }
  @AfterTest
  public void afterTest() {
  driver.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
  Assert.assertEquals("Sign-on: Mercury Tours", driver.getTitle());
  driver.quit();
  }
}
