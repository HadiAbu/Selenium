package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Selenium_Basics {

//	FirefoxBinary driverBin = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
//	FirefoxDriver driver = new FirefoxDriver(driverBin,null);
	
	FirefoxDriver driver = new FirefoxDriver();
	
	//chrome
	//System.setProperty("webdriver.chrome.driver","C:");
	ChromeDriver cd = new ChromeDriver();
	
	//ie
	InternetExplorerDriver ieDriver = new InternetExplorerDriver();
	@Test
	public void test(){
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.clear();
		element.sendKeys("Cisco");
		WebElement element2 = driver.findElement(By.name("btnK"));
		element2.click();
		
	}
}
