import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traverse {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Forgot your password?")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//form/input[@placeholder='Name']/following-sibling::input[1]")).sendKeys("smitali@gmail.com");
		  driver.close();

	}
}

