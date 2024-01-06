package STREAMS;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		//This program shows how to handle Pagination
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		List <String> price;
		do {
			List <WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
			price = elementList.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
			if(price.size()<1)
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click(); //Click on Next button if size of price<1
			}
		}while(price.size()<1);
		price.stream().forEach(s->System.out.println(s));

	}
	public static String getPrice(WebElement s)
	{
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText(); //we have used only part of the xpath here as we are using 's' as the driver passed as an argument
		return price;
		
	}

}
