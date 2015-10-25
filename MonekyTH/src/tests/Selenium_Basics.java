package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Selenium_Basics {

//	FirefoxBinary driverBin = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
//	FirefoxDriver driver = new FirefoxDriver(driverBin,null);
	
//	FirefoxDriver driver = new FirefoxDriver();
	
	//chrome
	//System.setProperty("webdriver.chrome.driver","C:");
//	ChromeDriver cd = new ChromeDriver();
	
	//ie
//	InternetExplorerDriver ieDriver = new InternetExplorerDriver();
/*
	@Test
	public void test(){
//		driver.get("http://www.google.com");
//		driver.manage().window().maximize();
//		WebElement element = driver.findElement(By.id("lst-ib"));
//		element.clear();
//		element.sendKeys("Cisco");
//		WebElement element2 = driver.findElement(By.name("btnK"));
//		element2.click();
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://bbc.com");
		System.out.println(driver.getTitle());
		System.out.println();
		
	}//
	*/
	@Test(dataProvider = "getData")
	public void testApp(String browserName,String username, String pass){
		WebDriver driver = new FirefoxDriver();
		
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][3];
		
		data[0][0] = "Moz";
		data[0][1] = "illa";
		data[0][2] = "fire";
		 
		data[1][0] = "Chrome";
		data[1][1] = "goo";
		data[1][2] = "gle";
		
		data[2][0] = "Inter";
		data[2][1] = "net";
		data[2][2] = "explorer";
		
		return data;
	}
}
