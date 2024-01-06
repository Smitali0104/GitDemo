import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Academylogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smita\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  driver.manage().window().maximize();
		  String Name = "rahul";
		  driver.findElement(By.id("inputUsername")).sendKeys(Name);
		  driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		  driver.findElement(By.id("chkboxOne")).click();
		  driver.findElement(By.id("chkboxTwo")).click();
		  driver.findElement(By.cssSelector("button[class*='submit']")).click();
		  
		  Thread.sleep(2000);
		  String Message = driver.findElement(By.tagName("p")).getText();
		  String ActualMessage = "You are successfully logged in.";
		  Assert.assertEquals(Message, ActualMessage);
		  String s= driver.findElement(By.tagName("h2")).getText();
		  Assert.assertEquals(s, "Hello "+Name+",");
		  //driver.findElement(By.className("logout-btn")).click();
		  //driver.close();
		  

	}

}
