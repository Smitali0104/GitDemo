import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Picklist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/shop");
		driver.manage().window().maximize();
		
		List<WebElement> products = driver.findElements(By.cssSelector(".btn-info")) ;
		
		
		for(int i=0;i<products.size();i++)
		{
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		}

	}

}
