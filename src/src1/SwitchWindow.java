package src1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //It will get all the windows opened
		Iterator<String>it = windows.iterator(); //It helps in iterating through the windows
		String parentWindow = it.next(); // It stores the parentWindow id- the first next will refer to the 0th index
		String childWindow = it.next(); // It stores the ChildWindow Id
		
		driver.switchTo().window(childWindow); //Switches to the Target,i.e.-ChildWindow
		System.out.println(driver.findElement(By.xpath("//div[@class='col-md-8']/p[2]")).getText());
		String emailId = driver.findElement(By.xpath("//div[@class='col-md-8']/p[2]")).getText().split("at")[1].trim().split(" ")[0];  //Grabbing the email id from child window
		
		driver.switchTo().window(parentWindow); //switching to Parent window
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		
		

	}

}
