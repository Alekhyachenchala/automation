package objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm_implicitwait 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'PIM')]")).click();
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'Add')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("alekhya"+Keys.TAB);
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("chenchala"+Keys.TAB);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'oxd-userdropdown-tab')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);

	}

}
