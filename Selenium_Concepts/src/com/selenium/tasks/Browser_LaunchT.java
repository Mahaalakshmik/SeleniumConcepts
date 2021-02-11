package com.selenium.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_LaunchT {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\IEDriverServer.exe");

		WebDriver driver1 = new InternetExplorerDriver();
		driver1.get("https://www.amazon.com/");

	}

}
