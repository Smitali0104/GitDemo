import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Forgot your password?")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();
		  String Text= driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		  String Password = SplitText(Text);
		  
		  driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		  Thread.sleep(1000);
		  String Name = "rahul";
		  driver.findElement(By.id("inputUsername")).sendKeys(Name);
		  driver.findElement(By.name("inputPassword")).sendKeys(Password);
		  driver.findElement(By.id("chkboxOne")).click();
		  driver.findElement(By.id("chkboxTwo")).click();
		  driver.findElement(By.cssSelector("button[class*='submit']")).click();
		  driver.close();

	}
	public static String SplitText(String Text)
	{
		String[] passwordArray = Text.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
		
	}

}
