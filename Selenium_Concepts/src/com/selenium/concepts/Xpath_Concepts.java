package com.selenium.concepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Concepts {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder, 'Email')]"));
		email.sendKeys("abc@gmail.com");
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys("1111111");
		//WebElement login_Btn = driver.findElement(By.xpath("//button[@name='login']"));
		//login_Btn.click();
		//typecasting la narrowing concept is used here.2 interfaces are used. 
		// rhs interface behaves as child(converts to lower data type) for lhs interface. 
		// TakesScreenshot ts = (TakesScreenshot) driver; 
		// File Source = ts.getScreenshotAs(OutputType.FILE);
		// File Destination = new File(
		// "C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Screenshot\\screen.png");
		// FileUtils.copyFile(Source, Destination);
		WebElement create_Btn = driver.findElement(By.xpath("//a[@role='button']"));
		create_Btn.click();
		driver.quit();

	}

}
