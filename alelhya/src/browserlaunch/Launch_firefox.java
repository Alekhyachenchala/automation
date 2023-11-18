package browserlaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox 
{

	public static void main(String[] args) 
	{
		FirefoxDriver firefox=new FirefoxDriver();
		
		firefox.get("https://www.hotstar.com/in/search");
		
		String PageTitle=firefox.getTitle();
		System.out.println(PageTitle);
		
		firefox.close();

	}

}
