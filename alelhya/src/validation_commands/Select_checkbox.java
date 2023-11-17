package validation_commands;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Select_checkbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		 WebElement OneWay=driver.findElement(By.xpath("(//li[contains(.,'One Way')])[1]"));
		 if (!OneWay.isSelected()) 
		 {
			OneWay.click();
			Thread.sleep(3000);
			System.out.println("oneway is selected");
		} 
		 else
		 {
			OneWay.click();
			System.out.println("oneway is deselected");
		}
	
		
	}

}
