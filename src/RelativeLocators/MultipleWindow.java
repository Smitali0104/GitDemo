package RelativeLocators;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws IOException {
		//This program shows how to open a new blank window and train the script to open the browser on that
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB); //It opens a new blank tab and now the driver points to it
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentwin = it.next();
		String childwin = it.next();
		driver.switchTo().window(childwin);
		driver.get("https://rahulshettyacademy.com/");
		String courseName=driver.findElement(By.xpath("(//div[@class='upper-box']/h2/a)[1]")).getText();
		driver.switchTo().window(parentwin);
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys(courseName);
		
		File file = name.getScreenshotAs(OutputType.FILE);//Takes screenshot of Name
		FileUtils.copyFile(file, new File("logo.png"));
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		

	}

}
