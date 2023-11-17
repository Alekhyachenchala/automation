package validation_commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Is_selected {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[contains(@class,'_58mt')])[1]")).click();
		System.out.println("female is selected");
		WebElement Male=driver.findElement(By.xpath("(//label[contains(@class,'_58mt')])[2]"));
		WebElement Custom =driver.findElement(By.xpath("(//label[contains(@class,'_58mt')])[3]"));
		
		if (Male.isSelected())
		{
			System.out.println("male is selected");
		} 
		else 
		{
			System.out.println("male not selected");
		}
		if (Custom.isSelected())
		{
			System.out.println("custom is selected");
		} 
		else 
		{
			System.out.println("custom not selected");
			
		}
	}

}
