package com.selenium.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_TablePractise1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();

		System.out.println("All Data");
		List<WebElement> all_Data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement datas : all_Data) {
			String all_Text = datas.getText();
			System.out.println(all_Text);

		}

		System.out.println("Row Data");
		List<WebElement> row_Data = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for (WebElement rdata : row_Data) {
			String row_Text = rdata.getText();
			System.out.println(row_Text);
		}
		System.out.println("Column Data");
		List<WebElement> column_Data = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for (WebElement cdata : column_Data) {
			String column_Text = cdata.getText();
			System.out.println(column_Text);

		}
		System.out.println("Particular Data");
		WebElement particular_Data = driver.findElement(By.xpath("//table/tbody/tr[4]/td[4]"));
		String particular_Text = particular_Data.getText();
		System.out.println(particular_Text);
		
		System.out.println("All headers");
		List<WebElement> all_Headers = driver.findElements(By.tagName("th"));
		for (int i = 0; i < all_Headers.size(); i++) {
			String all_Text = all_Headers.get(i).getText();
			System.out.println(all_Text);
			
		}
	}
	


}
