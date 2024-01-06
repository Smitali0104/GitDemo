package src1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaexecutor1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");// to scroll the entire window
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th"));
		System.out.println("No of Columns is:"+columns.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
		System.out.println("No of Columns is:"+rows.size());
		
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[2]/td[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[2]/td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[2]/td[3]")).getText());
		
		
		

	}

}
