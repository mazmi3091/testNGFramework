package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Lib {

	public static String getTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}

	public static WebElement findElem(WebDriver driver, String xpath) {
		WebElement el = driver.findElement(By.xpath(xpath));
		return el;
	}

	public static String readProperty(String key) throws IOException {
		File file = new File("D:\\Google Drive\\PIIT\\Selenium\\Java\\NewBDD\\src\\test\\resources\\ObjectRepository\\locator.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String locator = prop.getProperty(key);
		return locator;
	}

	public static void takeScreenshot(WebDriver driver, String name) throws IOException {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\Google Drive\\PIIT\\Selenium\\Java\\NewBDD" + name + ".png"));
		} catch (Exception e) {
			System.out.println("Error occured during screenshot");
		}

	}

}
