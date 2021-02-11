package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concepts {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement click_Btn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		click_Btn.click();
		Alert simple_Alert = driver.switchTo().alert();
		simple_Alert.accept();
		Thread.sleep(1000);
		System.out.println("Simple alert completed");
		WebElement confirm_Alert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm_Alert.click();
		WebElement confirm_Btn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirm_Btn.click();
		Alert confirm_Alert1 = driver.switchTo().alert();
		confirm_Alert1.dismiss();
		System.out.println("Confirm alert completed");
		WebElement prompt_Alert = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		prompt_Alert.click();
		WebElement prompt_Btn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prompt_Btn.click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		System.out.println("Prompt alert completed");
		driver.quit();
	}

}
