package STREAMS;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPrice {

	public static void main(String[] args) {
		//This program shows how to use Custom Methods in  Streams
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		List <WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		List <String> price = elementList.stream().map(s->getPrice(s)).collect(Collectors.toList());  //getPrice() is the customized method
		//price.stream().forEach(s->System.out.println(s));
		for(int i=0;i<elementList.size();i++)
		{
			System.out.println(elementList.get(i).getText() + (price.get(i)));
			
		}
		

	}
	public static String getPrice(WebElement s)
	{
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText(); //we have used only part of the xpath here as we are using 's' as the driver passed as an argument
		return price;
		
	}

}
