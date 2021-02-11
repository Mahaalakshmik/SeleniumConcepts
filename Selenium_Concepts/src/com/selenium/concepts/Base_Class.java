package com.selenium.concepts;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;

	// Browser Launch

	public static WebDriver getDriver(String browser) {
		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Driver\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));
				driver = new FirefoxDriver();

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		return driver;

	}

	// click

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	// send keys

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	// isEnabled

	public static void isEnabled(WebElement element) {

		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	// isSelected

	public static void isSelected(WebElement element) {

		boolean selected = element.isSelected();
		System.out.println(selected);

	}

	// isDisplayed

	public static void isDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}

	// get url

	public static void get(String url) {

		driver.get(url);

	}

	// get title

	public static void getTitle(String url) {

		String title = driver.getTitle();
		System.out.println(title);

	}
	// get current url

	public static void getCurrentUrl(String currentUrl) {
		String output = driver.getCurrentUrl();
		System.out.println(output);

	}
	// get Text

	public static void getText(WebElement element) {

		String text = element.getText();
		System.out.println(text);

	}

	// navigate to

	public static void navigateTo(String url) {

		driver.navigate().to(url);

	}

	// navigate back

	public static void navigateBack(String url) {

		driver.navigate().back();

	}

	// navigate forward

	public static void navigateForward(String url) {

		driver.navigate().forward();

	}

	// Refresh

	public static void navigateRefresh() {

		driver.navigate().refresh();

	}

	// close

	public static void close() {

		driver.close();

	}

	// quit

	public static void quit() {

		driver.quit();

	}

	// window handles

	public static void windowHandles(String type, String destination) {

		if (type.equalsIgnoreCase("SingleWindow")) {
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
		} else if (type.equalsIgnoreCase("Multiwindow")) {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String inputwindow : windowHandles) {
				System.out.println(inputwindow);
				String title = driver.switchTo().window(inputwindow).getTitle();
				System.out.println(title);
			}
			String ActualTitile = destination;
			for (String inputwindow : windowHandles) {
				if (driver.switchTo().window(inputwindow).getTitle().equalsIgnoreCase(destination)) {
					break;
				}

			}
		}
	}

	// get Attribute

	public static void getAttribute(WebElement element, String value) {
		String attribute_Name = element.getAttribute(value);
		System.out.println(attribute_Name);
	}

	// screenshot

	public static void snapShot(String path) throws Throwable {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(source, destination);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// isMultiple
	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	// getFirst Selected
	public static void getFirstSelected(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

	// all Selected options
	public static void allSelected(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement texts : allSelectedOptions) {
			String text = texts.getText();
			System.out.println(text);
		}
	}

	// dropdown

	public static void dropdown(WebElement element, String type, String value) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);

		}

		else if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);

		}

		else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);

		}

	}

	// actions

	public static void actioning_Method(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();

	}

	public static void actions_Click(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		a.click(element).build().perform();

	}

	public static void javascript_Executor(String type, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("scrollIntoView()")) {
			js.executeScript("arguments[0].scrollIntoView();", element);

		} else if (type.equalsIgnoreCase("click()")) {
			js.executeScript("arguments[0].click();", element);
		}

	}

	public static void simpleAlert() {

		try {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void confirmAlert(String Ok, String Cancel) {

		if (Ok.equalsIgnoreCase("OK")) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		} else if (Cancel.equalsIgnoreCase("Cancel")) {
			driver.switchTo().alert().dismiss();
			driver.switchTo().defaultContent();
		} else {
			System.out.println("Confirm alert is invalid");
		}

	}

	public static void promptAlert(String Ok, String Cancel, String Text) {

		try {
			if (Ok.equalsIgnoreCase("Ok")) {
				driver.switchTo().alert().sendKeys(Text);
				driver.switchTo().alert().accept();
				driver.switchTo().defaultContent();
			} else if (Cancel.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().sendKeys(Text);
				driver.switchTo().alert().dismiss();
				driver.switchTo().defaultContent();

			} else {
				System.out.println("Prompt alert is invalid");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void waitConcepts(String type, WebElement element, int Duration, TimeUnit format) {
		try {
			if (type.equalsIgnoreCase("implicit wait")) {
				driver.manage().timeouts().implicitlyWait(Duration, format);
			} else if (type.equalsIgnoreCase("Explicit wait")) {
				WebDriverWait wait = new WebDriverWait(driver, Duration);
				wait.until(ExpectedConditions.visibilityOf(element));
			} else if (type.equalsIgnoreCase("page load timeout")) {
				driver.manage().timeouts().pageLoadTimeout(Duration, format);
			} else if (type.equalsIgnoreCase("Fluent wait")) {
				Wait wait1 = new FluentWait(driver).withTimeout(Duration, format).pollingEvery(Duration, format)
						.ignoring(Exception.class);
			} else {
				System.out.println("Wait is invalid");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void frameOperations(String type, WebElement element, int value) {
		if (type.equalsIgnoreCase("element")) {

			driver.switchTo().frame(element);
		}

		else if (type.equalsIgnoreCase("index")) {

			driver.switchTo().frame(value);
		}

		else if (type.equalsIgnoreCase("id")) {

			WebElement iframe_id = driver.findElement(By.id("value"));// error
			driver.switchTo().frame(iframe_id);

		}
	}

	public static void frameIndex(int value) {

		driver.switchTo().frame(value);

	}

}
