import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import org.j

import dev.failsafe.internal.util.Assert;


public class googleSearch {

@Test
	public void Searchpage() throws InterruptedException
	{
		
		
		System.setProperty("WebDriver.Chrome.Driver","/Users/rashm/Drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement P = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		P.sendKeys("Times of India");
		P.submit();
		//WebElement W = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.id(null)));
		driver.findElement(By.linkText("https://m.timesofindia.com/")).click();
		
	   Assert.
	}
}
