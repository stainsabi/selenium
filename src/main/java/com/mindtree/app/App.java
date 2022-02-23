package com.mindtree.app;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.edge.driver", ".//driver//msedgedriver.exe");
    	WebDriver driver3= new EdgeDriver();
    	driver3.get("https://www.facebook.com/");
    	System.out.println(driver3.getTitle());
    	
    	driver3.quit();
    	
    }
    }

