package com.pruthvi.BlazeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReservePage {
	public WebDriver driver;

	public ReservePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	// properties
	By vChooseFight = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input");

	// Functions

	public WebElement fChooseFight() {
		return driver.findElement(vChooseFight);

	}
}
