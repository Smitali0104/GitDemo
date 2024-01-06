package STREAMS;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class WebTableSort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		//Clicking on the Column Header to sort
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Arranging a list of elements of the Column
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		
		//Storing the String values of the Webelements List
		List<String> originalList = list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sorting the list we got from above step
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		//Comparing both the Strings
		Assert.assertTrue(originalList.equals(sortedList));

	}

}
