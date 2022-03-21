package com.mindtree.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void chrome() {
    	System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	System.out.println(driver.getTitle());
    	if("Facebook – log in or sign up".equals(driver.getTitle())) {
    		assertTrue(true);
    	}
    	else {
    		assertTrue(false);
    	}
    	driver.quit();
    }
    @Test
    public void firefox() {
    	System.setProperty("webdriver.gecko.driver", ".//driver//geckodriver.exe");
    	WebDriver driver2= new FirefoxDriver();
    	driver2.get("https://www.facebook.com/");
    	System.out.println(driver2.getTitle());
    	if("Facebook – log in or sign up".equals(driver2.getTitle())) {
    		assertTrue(true);
    	}
    	else {
    		assertTrue(false);
    	}
    	driver2.quit();
    }
   
}
