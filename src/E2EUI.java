import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2EUI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.manage().window().maximize();
		  
		  //To select Country
		  driver.findElement(By.id("autosuggest")).sendKeys("ind");
		  Thread.sleep(3000);
		  List <WebElement> Options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		  for(WebElement Option: Options)
		  {
			  if(Option.getText().equalsIgnoreCase("India"))
					  {
				  Option.click();
				  break;
					  }
		  }
		  
		  //To select the Radio Button
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		  
		  //To select the Departure and Arrival City
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  driver.findElement(By.xpath("//a[@value='SXR']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
		  
		  //To select the Departure Date
		  driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		  
		  //To select the Passengers
		  driver.findElement(By.id("divpaxinfo")).click();
		  Thread.sleep(2000L);
		  for(int i=0;i<5;i++)
		  {
			  driver.findElement(By.id("hrefIncAdt")).click();
		  }
		  
		  driver.findElement(By.id("btnclosepaxoption")).click();
		  
		  //To select the Currency
		  WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		  Select dropdown = new Select(Staticdropdown);
		  dropdown.selectByIndex(1);
		  
		//To select the Checkbox
		  driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		  
		  
		  
		  
	}

}
