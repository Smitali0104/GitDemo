

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practicelab1 {

	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions options = new ChromeOptions();
		  //options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("inputUsername")).sendKeys("Smitali");
		  driver.findElement(By.name("inputPassword")).sendKeys("9538795831");
		  driver.findElement(By.id("chkboxOne")).click();
		  driver.findElement(By.id("chkboxTwo")).click();
		  driver.findElement(By.cssSelector("button[class*='submit']")).click();
		  Thread.sleep(1000);
		  System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		  
		  driver.findElement(By.linkText("Forgot your password?")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		  driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).sendKeys("john@rsa.com");
		  driver.findElement(By.xpath("//form/input[@type='text'][3]")).sendKeys("9538795831");
		  driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		  
		  Thread.sleep(1000);
		  driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		  driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		  driver.findElement(By.id("chkboxOne")).click();
		  driver.findElement(By.id("chkboxTwo")).click();
		  driver.findElement(By.cssSelector("button[class*='submit']")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.className("logout-btn")).click();
		  //driver.close();
		  
		}


	}
