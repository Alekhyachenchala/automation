package validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Is_displayed {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//label[contains(@class,'58mt')])[3]")).click();
		WebElement pronoun =driver.findElement(By.xpath("//select[contains(@aria-label,'Select your pronoun')]"));
		
		if (pronoun.isDisplayed()) 
		{
			System.out.println("select your pronoun");
			
			
		} 
		else
		{
			System.out.println("pronoun not avalible");
		}
		

	}

}
