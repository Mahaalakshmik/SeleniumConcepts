package com.selenium.tasks;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Tasks {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();

		WebElement continue_Btn = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
		Thread.sleep(3000);
		continue_Btn.click();
		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		System.out.println("Simple alert completed");

	}

}
