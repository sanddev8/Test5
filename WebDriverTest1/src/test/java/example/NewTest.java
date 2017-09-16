package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
@Listeners(example.ListenerDemo2.class)

public class NewTest {
  public static String url="http://newtours.demoaut.com/";
  public static WebDriver driver = new FirefoxDriver();
  @Test   
  public void Login() {
  driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("tutorial");
  driver.findElement(By.xpath("//*[contains(@name,'password')]")).sendKeys("tutorial");
  driver.findElement(By.xpath("//*[contains(@name,'login')]")).submit();
  Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
  }
  @Test
  public void Launch() {
  driver.get(url);
  Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
  }
  @Test
  public void SignOff() {
  driver.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
  Assert.assertEquals("Sign-on: Mercury Tours", driver.getTitle());
  driver.quit();
  }
}
