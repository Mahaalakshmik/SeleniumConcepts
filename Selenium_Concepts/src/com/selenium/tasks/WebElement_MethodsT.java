package com.selenium.tasks;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_MethodsT {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// WebElement Sign_In = driver.findElement(By.id("email"));
		// Sign_In.click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		//WebElement password = driver.findElement(By.name("//input[@name='pass']"));
		
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Screenshot\\fbss.png");
		FileUtils.copyFile(Source, Destination);
		driver.quit();
		
		
	}

}
