package com.flipkart.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	WebDriver driver;
	Homepage homePage;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.xpath("//div[@class='uMF2cc']/div[1]/div[2]/div[1]/form/div[1]/input[1]");
	By passcode = By.xpath("//input[@type='password']");
	By loginButton = By.xpath("//div[@class='uMF2cc']/div[1]/div[2]/div[1]/form/div[3]/button");

	public void username(String uName) {
		driver.findElement(userName).sendKeys(uName);
	}

	public void passWord(String pass) {
		driver.findElement(passcode).sendKeys(pass);
	}

	public WebElement submit() {
		return driver.findElement(loginButton);
	}
}
