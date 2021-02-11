package com.selenium.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Launch1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		}
}