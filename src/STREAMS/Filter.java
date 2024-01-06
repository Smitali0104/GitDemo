package STREAMS;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filter {

	public static void main(String[] args) {
		//This program filters the list and validates the results
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List <WebElement> veggieList = driver.findElements(By.xpath("//tr/td[1]"));
		List <WebElement> filteredList = veggieList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(veggieList.size(), filteredList.size());
		

	}

}
