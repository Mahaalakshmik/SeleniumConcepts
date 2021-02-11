package com.selenium.practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Practice {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahaalakshmi K\\Desktop\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Mahaalakshmi K\\Desktop\\eclipse-workspace\\Selenium_Project\\Screenshot\\google.png");
		FileUtils.copyFile(source, Destination);
		//String currentUrl = driver.getCurrentUrl();
		//System.out.println("Current url is " +currentUrl);
		//String title = driver.getTitle();
		//System.out.println("title is " + title);
		//driver.navigate().to("https://www.amazon.in/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.close();
		driver.quit();
	}

}
