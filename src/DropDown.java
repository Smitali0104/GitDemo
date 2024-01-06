import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.manage().window().maximize();
		  
		  //To select the Currency dropdown
		  WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		  Select dropdown = new Select(Staticdropdown);
		  dropdown.selectByIndex(1);
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  dropdown.selectByVisibleText("USD");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  dropdown.selectByValue("AED");
		  System.out.println(dropdown.getFirstSelectedOption().getText());
		  
		  //To manage the Passengers dropdown
		  driver.findElement(By.id("divpaxinfo")).click();
		  Thread.sleep(2000L);
		  for(int i=0;i<5;i++)
		  {
			  driver.findElement(By.id("hrefIncAdt")).click();
		  }
		  
		  driver.findElement(By.id("btnclosepaxoption")).click();
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");

	}

}
