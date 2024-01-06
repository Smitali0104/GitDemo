import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.manage().window().maximize();
		  
		  
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		  
		  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		  {
			  System.out.println("its enabled");

			  Assert.assertTrue(true);
		  }
		  
		  //driver.findElement(By.xpath("//input[@name = 'ctl00$mainContent$view_date1']")).click();
		  //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
