package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mahaalakshmi K\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		System.out.println("Row Data");
		List<WebElement> row_Data = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement data : row_Data) {
			String output = data.getText();
			System.out.println(output);

		}
		System.out.println("Column Data");
		List<WebElement> column_Data = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for (WebElement data1 : column_Data) {
			String output_1 = data1.getText();
			System.out.println(output_1);

		}
		System.out.println("Particular Data");
		WebElement pd = driver.findElement(By.xpath("//table/tbody/tr[3]/td[4]"));
		String output3 = pd.getText();
		
		
		System.out.println(output3);
		System.out.println("All Data");
		List<WebElement> all_Data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all_Data1 : all_Data) {
			String outpt = all_Data1.getText();
			System.out.println(outpt);
			
		}
		List<WebElement> all_Headers = driver.findElements(By.tagName("th"));
		for (WebElement ahd1 : all_Headers) {
			String headers = ahd1.getText();
			System.out.println(headers);
			
		}
		// can use both for loop and for each loop //
		for (int i = 0; i < all_Headers.size(); i++) {
			String allhdr1 = all_Headers.get(i).getText();
			System.out.println(allhdr1);
		}
		driver.quit();

	}

}
