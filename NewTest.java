package proje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewTest {
  @Parameters("Browser")
  @Test
  public void f(String browserName) throws InterruptedException {
	  
	  System.out.println("Parameter value is "+browserName);
	  WebDriver driver = null;
	  if(browserName.contains("Chrome"))
	  {
		  WebDriverManager.chromedriver().setup();  
		   driver = new ChromeDriver();
	  }
	  else if(browserName.contains("Firefox"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		   driver = new FirefoxDriver();
	  }
	 
		 
		 driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		 Thread.sleep(5000);
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("logout_sidebar_link")).click();
		 driver.close();
	  
	  
  }
 
 
}
