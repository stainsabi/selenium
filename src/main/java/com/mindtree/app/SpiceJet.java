package com.mindtree.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", ".//driver//msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
		
		
		
		List<WebElement> month=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1euycsn']//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']//div[@class='css-1dbjc4n r-k8qxaj']"));
		for(WebElement mon: month) {
			System.out.println(mon.getText());
		}
		System.out.println(month.size());
		
		try {
			List<WebElement> day=driver.findElements(By.xpath("//div[@data-testid='undefined-month-February-2022']//div[contains(@data-testid,'undefined-calendar-day')]"));
			
			for(WebElement da: day) {
				if("28".equals(da.getText())) {
					
					da.click();
				}
			}
			
		}
		catch( Exception e) {
			System.out.println("Enter Catch block"+ e);
			driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
			List<WebElement> da=driver.findElements(By.xpath("//div[@data-testid='undefined-month-February-2022']//div[contains(@data-testid,'undefined-calendar-day')]"));
			
			for(WebElement d: da) {
				if("28".equals(d.getText())) {
					
					d.click();
				}
			}
			
			 
			
		}
		
		driver.quit();
		
		
		//div[@class='css-1dbjc4n']
	}

}
