package gettext;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Recordfound {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(.,'PIM')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("0451");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		Thread.sleep(3000);
		
		WebElement Record=driver.findElement(By.xpath("(//span[contains(@class,'oxd-text oxd-text--span')])[13]"));
		String RecordText=Record.getText();
		
		if (RecordText.contains("(1) Record Found"))
		{
			System.out.println("record found");
		} 
		else 
		{
			System.out.println("no record found ");
		}
		
		
	}

}
