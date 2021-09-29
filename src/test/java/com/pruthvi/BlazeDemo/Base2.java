package com.pruthvi.BlazeDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base2{
public WebDriver driver;
	
	
	public  WebDriver Browsercall() throws IOException
	{
		Properties properties= new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\00005321\\eclipse-workspace\\Arisframework2\\Data.properties");
        properties.load(fis);
        String vBrowser=properties.getProperty("Browser");
        
     

        if(vBrowser.equalsIgnoreCase("Chrome"))
        {
        System.out.println("Chrome Browser Started");  
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005321\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
        
        }
        else if (vBrowser.equalsIgnoreCase("Firefox"))
        {
            System.out.println("FireFox Browser Started");   
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\00005321\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
        }
        else
        {
            System.out.println("Invalid Browser");
        }
		return driver;
		
		}

}
