package com.selenium.practise;

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
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/bedsheets");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		List<WebElement> all_Prices = 
				driver.findElements(By.xpath("//span[@class='product-discountedPrice']//following-sibling::span[@class='product-discountPercentage']"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ArrayList<Integer> list_Price = new ArrayList<Integer>();
		for (WebElement prices : all_Prices) {
			String replaced_String = prices.getText().replace("Rs. ", "");
			int values = Integer.parseInt(replaced_String);
			list_Price.add(values);
			System.out.println(values);
			
			
			
		}
		System.out.println("Maximum price available is :" + Collections.max(list_Price));
		
}
}