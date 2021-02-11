package com.selenium.concepts;

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
		driver.get("https://www.myntra.com/men-tshirts");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//here we are retrieving the product strike rate as output with the help of discounted price
				List<WebElement> all_Prices = driver.findElements(
				By.xpath("//span[@class='product-discountedPrice']//following-sibling::span[@class='product-strike']"));
			List<Integer> price_List = new ArrayList<Integer>();
		for (WebElement prices : all_Prices) {
			String price = prices.getText().replace("Rs. ", "");
			int values = Integer.parseInt(price);
			System.out.println(values);
			price_List.add(values);
		}
		System.out.println("Maximum value:" + Collections.max(price_List));

	}

}
