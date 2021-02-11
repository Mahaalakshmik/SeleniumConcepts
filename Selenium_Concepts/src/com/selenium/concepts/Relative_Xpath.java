package com.selenium.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
		email.sendKeys("Abc@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("54fff");

		WebElement create_Page = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = create_Page.getText();
		System.out.println(text);
		WebElement facebook_txt = driver.findElement(By.xpath("//h2[contains(text(),'helps')]"));
		String text2 = facebook_txt.getText();
		System.out.println(text2);
		WebElement login_Btn = driver.findElement(By.xpath("//button[@type='submit']"));
		login_Btn.click();

	}

}
