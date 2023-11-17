package validation_commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Deselected_checkbox
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.nocodeflow.net/register");
		Thread.sleep(3000);
		
		WebElement Getfuture= driver.findElement(By.xpath("(//div[contains(@class,'mb-4')])[2]"));
		if (Getfuture.isSelected())
		{
			Getfuture.click();
			System.out.println("is selected");
		} 
		else
		{
			Getfuture.click();
			System.out.println(" not  selected");
		}
		;
		
		
	}

}
