import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Location2 {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.Driver","/Users/rashm/Drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String name = "rashmin.vibhandik@gmail.com";
		String password =getPassword(driver);
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("p")).getText();
		//Assert.assetEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
	
	}
	
	public static String getPassword(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}



}
