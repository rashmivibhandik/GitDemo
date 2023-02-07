import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;

public class SelIntroduction{

	
	public static void main(String[] args) throws InterruptedException
	{
		//chromediver.exe->is third party library provided by chrome team to access browser
		//as we can not invoke chrome browser directly 
		//selenium not directly communication to browser but through browser driver
		
		//StaleElementrefferenceException due to change is HTML DOM
		
		//IIlegalstate expection if we don't set property 
		System.setProperty("WebDriver.Chrome.Driver","/Users/rashm/Drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//firefox launch
		//gechodriver
		//System.setProperty("WebDriver.gecho.Driver","/Users/rashm/Drivers/chromedriver.exe" );
		//WebDriver driver1 = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.wait(10);
		String name = "rashmin.vibhandik@gmail.com";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("Aarush@123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rashmi");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rashmin.vibhandik@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9158672788");
		driver.findElement(By.xpath("(//button[normalize-space()='Reset Login'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//p[@class='infoMsg'])[1]")).getText());
		
		//Assert.assetEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		//driver.close();.
		
		
		
	}
}