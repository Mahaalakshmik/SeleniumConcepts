package com.selenium.practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement click_Btn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		click_Btn.click();
		
		Alert simple_Alert = driver.switchTo().alert();
		simple_Alert.accept();
		
		Thread.sleep(2000);
		WebElement ok_CancelBtn = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		ok_CancelBtn.click();
		
		WebElement confirm_Box = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		confirm_Box.click();
		
		Alert confirm_Alert = driver.switchTo().alert();
		confirm_Alert.dismiss();
		
		WebElement prompt_click= driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		prompt_click.click();
		
		WebElement prompt_Box = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		prompt_Box.click();
		
		Alert prompt_Alert = driver.switchTo().alert();
		String text = prompt_Alert.getText();
		System.out.println(text);
		prompt_Alert.accept();
		
	}

}
