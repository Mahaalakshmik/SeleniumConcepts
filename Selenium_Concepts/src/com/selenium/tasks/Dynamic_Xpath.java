package com.selenium.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		List<WebElement> all_Prices = driver.findElements(By.
				xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		List<Integer> prize_List = new ArrayList<Integer>();
		for (WebElement prices : all_Prices) {
			String new_Value = prices.getText().replace("Rs. ", "");
			int value = Integer.parseInt(new_Value);
			System.out.println(value);
			prize_List.add(value);
		}
		System.out.println("Minimum price of the list is :" +Collections.min(prize_List));
			
		
	}
}
