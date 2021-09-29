package com.pruthvi.BlazeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlazeHomePage {

	public WebDriver driver;

	By vdeparture = By.name("fromPort");
	By vdestination = By.name("toPort");
	By vFindFights = By.xpath("//input[@type='submit']");

	public BlazeHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	// Elements or properties of Blaze Home Page

	// Functions /call it

	public WebElement fdeparture() {
		return driver.findElement(vdeparture);

	}

	public WebElement fdestination() {
		return driver.findElement(vdestination);

	}

	public WebElement fFindFights() {
		return driver.findElement(vFindFights);

	}
}
