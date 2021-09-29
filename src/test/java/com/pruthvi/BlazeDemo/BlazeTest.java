package com.pruthvi.BlazeDemo;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BlazeTest extends Base2 {
	private Properties properties;
	
	@Test
	public void TS001() throws Throwable, IOException, InterruptedException
	 {
		
		driver=Browsercall();
		driver.get("https://blazedemo.com/");
		//driver.get(properties.getProperty("URL"));
		 driver.manage().window().maximize();
		 
		 
		 String DemoPage=driver.getTitle();
		 if (DemoPage.equalsIgnoreCase("BlazeDemo"));
		 {
			 System.out.println("Navigated to BlazeDemo Page");
			 System.out.println("Pass");
			 
		 }
		BlazeHomePage bh = new BlazeHomePage(driver);
		Select bhSelect = new Select((WebElement) bh.fdeparture());
		bhSelect.selectByVisibleText("Boston");
		Select bhSelect1 = new Select((WebElement) bh.fdestination());
		bhSelect1.selectByVisibleText("New York");
		bh.fFindFights().click();
		String rptitle=driver.getTitle();
		if (rptitle.equalsIgnoreCase("BlazeDemo - reserve"));
		 {
			 System.out.println("Navigated to BlazeDemo Reserve");
			 System.out.println("Pass");
			 
		 }
		 ReservePage rp=new ReservePage(driver);
		 rp.fChooseFight().click();
		String PurchasePageTitle= driver.getTitle();
		if (PurchasePageTitle.equalsIgnoreCase("BlazeDemo Purchase"));
		 {
			 System.out.println("Navigated to BlazeDemo Purchase");
			 System.out.println("Pass");
			 
		 }
		 
		 PurchasePage pp=new PurchasePage(driver);
		 pp.fname().sendKeys("Pruthvi");
		 pp.fCreditCardNo().sendKeys("1111");
		 pp.fNameOnCard().sendKeys("pruthvi");
		 pp.fCheckBox().click();
		 pp.fPurchaseFightButton().click();
		 String ConfirmPageTitle= driver.getTitle();
			if (ConfirmPageTitle.equalsIgnoreCase("BlazeDemo Confirmation"));
			 {
				 System.out.println("Navigated to BlazeDemo Confirmation");
				 System.out.println("Pass");
				 
			 }
			 ConfirmationPage cp=new ConfirmationPage(driver);
			 String Amt=cp.fAmount().getText();
			 String Card=cp.fCardNo().getText();
			String Exp= cp.fExpiration().getText();
			
			System.out.printf("Amount, Card Number and Expiration is", Amt, Card,Exp );
			driver.close();
	}
}


