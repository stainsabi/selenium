package com.mindtree.app;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mosueOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"))).build().perform();
		Thread.sleep(5000L);
		List<WebElement> language=driver.findElements(By.xpath("//div[@id='nav-flyout-icp']//div[@class='nav-template nav-flyout-content nav-tpl-itemList']//a[contains(@href,'_IN')]"));
		System.out.println(language.size());
		
		for(WebElement ln: language) {
			if("മലയാളം - ML".equals(ln.getText())) {
				ln.click();
			}
		}
		
		driver.quit();
		//span[@style='unicode-bidi:isolate; direction:ltr;']
	
		////*[@id="nav-flyout-icp-footer-flyout"]/div[2]/a[1]
		//"//div[@class='nav-template nav-flyout-content nav-tpl-itemList']//a[contains(@href,'#switch-')]"
		
	}

}
