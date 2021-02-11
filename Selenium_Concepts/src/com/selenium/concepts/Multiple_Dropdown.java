package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		WebElement multiple_Dd = driver.findElement(By.id("multi-select"));
		Select s = new Select(multiple_Dd);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		List<WebElement> all_Options = s.getOptions();
		int size = all_Options.size();
		System.out.println("Size is " + size);
		for (int i = 0; i < size; i++) {
			if (i == 1 || i == 3 || i == 5) {
				s.selectByIndex(i);
			}
			}
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			System.out.println("allSelectedOptions");
			for (WebElement options : allSelectedOptions) {
				String values1 = options.getText();
				System.out.println(values1);
			
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			String text = firstSelectedOption.getText();
			System.out.println("First selected option is " + text);
			System.out.println("All options of multiple dropdown");
			
			for (WebElement choices : all_Options) {
				String output = choices.getText();
				System.out.println(output);
			}
			}
			driver.quit();
		}

	}
