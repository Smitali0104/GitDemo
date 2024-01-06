import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  driver.findElement(By.xpath("//a[@value='SXR']")).click();
		  Thread.sleep(2000);
		  //driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();//--This or the below one can be used
		  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GWL']")).click();
		  
		  

	}

}
