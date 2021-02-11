package com.selenium.concepts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Abc@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("14254");
		WebElement login_Btn = driver.findElement(By.name("login"));;
		login_Btn.click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Screenshot\\snap1.png");
		FileUtils.copyFile(Source, Destination);
		driver.quit();
	}
		
		
		
	}


