package com.selenium.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Tasks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement creative_Image = driver.findElement(By.xpath("//div[text()='Creative Images']"));
		creative_Image.click();
		WebElement video = driver.findElement(By.xpath("//label[text()='Video']"));
		video.click();

	}

}
