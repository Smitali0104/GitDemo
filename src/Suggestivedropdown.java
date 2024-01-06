import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestivedropdown {

	private static final String NULL = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.manage().window().maximize();
		  
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
		  //driver.close();
		  
		  
		  
		  

	}

}
