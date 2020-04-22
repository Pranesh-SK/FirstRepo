package com.flipkart.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage<action> {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='zi6sUf']/div[1]/ul[1]/li[1]/span")
	WebElement ele_link;
	
	@FindBy(tagName = "a") 
	List<WebElement> links;
	
	@FindBy(xpath="//span[contains(text(),'Cart')]")
	public WebElement cart;
	
	public WebElement electronics_list() {
		return ele_link;
	}
	
	public List<WebElement> links() {
		return links;
	}
	
	public boolean checkcart() {
		return cart.isDisplayed();
	}
}
