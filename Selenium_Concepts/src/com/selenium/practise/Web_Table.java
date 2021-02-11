package com.selenium.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		driver.manage().window().maximize();

		System.out.println("Row Data");
		List<WebElement> row_Data = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement Rowss : row_Data) {
			String row_Text = Rowss.getText();
			System.out.println(row_Text);
		}

		System.out.println("Column Data");
		List<WebElement> column_Data = driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
		for (WebElement columnss : column_Data) {
			String column_Text = columnss.getText();
			System.out.println(column_Text);

		}

		System.out.println("Particular Data");
		WebElement part_Data = driver.findElement(By.xpath("//table/tbody/tr[8]/td[3]"));
		String part_Text = part_Data.getText();
		System.out.println(part_Text);

		System.out.println("All Data");
		List<WebElement> all_Data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement datas : all_Data) {
			String datas_Text = datas.getText();
			System.out.println(datas_Text);

		}
		List<WebElement> headers = driver.findElements(By.tagName("th"));
		for (int i = 0; i < headers.size(); i++) {
			String headers_Text = headers.get(i).getText();
			System.out.println(headers_Text);
		}

	}
}
