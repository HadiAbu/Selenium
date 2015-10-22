package tests;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basics {

	FirefoxBinary driverBin = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"));
	FirefoxDriver driver = new FirefoxDriver(driverBin,null);
}
