package com.flipkart.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basePage {
	public WebDriver driver;

	public basePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver initializ_driver() throws IOException {
		Properties prop = new Properties();
		FileInputStream datafile = new FileInputStream(
				"/home/pranesh/Documents/Eclipse_Home/Flipkart/src/main//java/com/flipcart/Utils/data.properties");
		prop.load(datafile);
		String browserName = prop.getProperty("browser");
		System.out.println("This is " + browserName +" browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "/Drivers/chrome/chromedriver");
			driver = new ChromeDriver();
		} else {
			System.out.println("No browser found");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

}
