package validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_enabled {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?lat=17.3687663&long=78.5307314&shared=1");
		Thread.sleep(3000);
		 
		new Select(driver.findElement(By.xpath("//select[contains(@name,'stateName')]")))
		;
		Thread.sleep(3000);
		WebElement city = driver.findElement(By.xpath("(//select[@class='input'])[1]"));
		
		
		if (!city.isEnabled()) 
		{
			System.out.println("dropdown disabled");
		} 
		else 
		{
			System.out.println("dropdown enabled");
		}

	}

}
