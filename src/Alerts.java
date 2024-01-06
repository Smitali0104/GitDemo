import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("name")).sendKeys("Smitali");
		  driver.findElement(By.id("alertbtn")).click();
		  System.out.println(driver.switchTo().alert().getText());
		  driver.switchTo().alert().accept();
		  
		  
	}

}
