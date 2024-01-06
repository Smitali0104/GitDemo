package src1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//button[@id='product-menu-toggle']"))).build().perform();
		//driver.findElement(By.xpath("//li[@class='pricing-menu-link']/a")).click();
		//driver.findElement(By.xpath("//li[@class='hide-sm hide-xs']/button")).click();
		a.moveToElement(driver.findElement(By.id("doc-search-box-input"))).click().keyDown(Keys.SHIFT).sendKeys("selenium").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//li[@class='hide-sm hide-xs']/button"))).contextClick().build().perform();
		
		
		

	}

}
