package com.pruthvi.BlazeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchasePage {

	public WebDriver driver;
	

	public PurchasePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	//elements
	By vName = By.id("inputName");
	By vCreditCardNo = By.id("creditCardNumber");
	By vNameOnCard = By.id("nameOnCard");
	By vCheckBox = By.xpath("/html/body/div[2]/form/div[11]/div/label");
	By vPurchaseFightButton = By.xpath("//input[@type='submit']");
	
	// Functions

	public WebElement fname() {
		return driver.findElement(vName);
	}

	public WebElement fCreditCardNo() {
		return driver.findElement(vCreditCardNo);

	}

	public WebElement fNameOnCard() {
		return driver.findElement(vNameOnCard);

	}

	public WebElement fCheckBox() {
		return driver.findElement(vCheckBox);

	}

	public WebElement fPurchaseFightButton() {
		return driver.findElement(vPurchaseFightButton);

	}
}
