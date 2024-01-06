import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.manage().window().maximize();
		   
		  Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		  driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		  Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		  System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
