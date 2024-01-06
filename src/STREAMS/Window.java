package STREAMS;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Window {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		List<WebElement> links =driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		SoftAssert a = new SoftAssert();
		for(WebElement link:links)
		{
			String url = link.getAttribute("href"); //it gets the attribute of the webelement
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD"); //request method is HEAD
			conn.connect();
			int responseCode = conn.getResponseCode();
			a.assertTrue(responseCode<400, "The link" +link.getText()+"is broken with Code"+responseCode);
		}
		a.assertAll();

	}

}
