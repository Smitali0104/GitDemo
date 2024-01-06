package scr2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); //Invoking object of ChromeOptions
		options.setAcceptInsecureCerts(true); //using the method and passing true to handle the certificate error
		WebDriver driver = new ChromeDriver(options);//passing the object information to the driver
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		

	}

}
