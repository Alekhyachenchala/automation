package browserlaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_chrome 
{

	public static void main(String[] args)
	{
		ChromeDriver chrome=new ChromeDriver();
		
		chrome.get("https://www.hotstar.com/in/search");
		
		String pageTitle=chrome.getTitle();
		System.out.println(pageTitle);
		
		chrome.quit();

	}

}
