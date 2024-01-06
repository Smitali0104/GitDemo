package src1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Veggiecart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\smita\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();

		String[] ItemsNeeded = { "Cauliflower", "Beetroot", "Carrot" }; // Initializing String Array for the Items
																		// needed
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		addItemsToCart(driver, ItemsNeeded, w); //Calling the method to add items to cart
		
		checkOut(driver,w);

	}

	public static void addItemsToCart(WebDriver driver, String[] ItemsNeeded, WebDriverWait w)  {

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='cart-icon']/img")));
		List<WebElement> Products = driver.findElements(By.xpath("//h4[@class='product-name']"));// Storing all the
																									// WebElements in
																									// the List

		for (int i = 0; i < Products.size(); i++) {
			int counter = 0; // Counter used for coming out of the loop.

			String[] Prod = Products.get(i).getText().split("-"); // Splitting the Product List to get only veggies
																	// names
			String FormattedName = Prod[0].trim();// Trimming the white spaces
			List VeggiesNeededList = Arrays.asList(ItemsNeeded); // Converting ItemsNeeded Array to ArrayList

			if (VeggiesNeededList.contains(FormattedName)) {
				counter++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (counter == ItemsNeeded.length) {
					break;
				}
			}
		}
		
	}
	
	public static void checkOut(WebDriver driver, WebDriverWait w)
	{
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		//Writing explicit wait for the message to be visible
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}

}
