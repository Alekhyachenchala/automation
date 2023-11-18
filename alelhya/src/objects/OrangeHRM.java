package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(.,'PIM')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("chenchala"+Keys.TAB);
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("alekhya"+Keys.TAB);
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']")).sendKeys("0328");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'oxd-userdropdown-tab')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();

	}

}
