package browser_option;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class Headless 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--headless");
		

		WebDriver driver=new ChromeDriver(options);
		System.out.println("Browser Is Opened");
		
		driver.get("http://instagram.com");
		Thread.sleep(4000);
		System.out.println("page Loaded");
		
		System.out.println("window Title Presented --> "+driver.getTitle());
		
		System.out.println("browser is closed");
		
		driver.close();

	}

}
