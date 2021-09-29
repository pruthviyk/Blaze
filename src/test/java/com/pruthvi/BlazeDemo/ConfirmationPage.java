package com.pruthvi.BlazeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {
	public WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	// Elements
	By vAmount = By.xpath("/html/body/div[2]/div/table/tbody/tr[3]/td[2]");
	By vCardNo = By.xpath("/html/body/div[2]/div/table/tbody/tr[4]/td[2]");
	By vExpiration = By.xpath("/html/body/div[2]/div/table/tbody/tr[5]/td[2]");

	// Functions

	public WebElement fAmount() {
		return driver.findElement(vAmount);

	}

	public WebElement fCardNo() {
		return driver.findElement(vCardNo);

	}

	public WebElement fExpiration() {
		return driver.findElement(vExpiration);

	}

}
