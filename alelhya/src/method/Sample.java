package method;

public class Sample 
{
	public static void start() 
	{
		System.out.println( "start ");

	}
	
	public void change()
	{
		System.out.println("change");
	}		
	public static void main(String[] args) 
	{
	    Sample.start();
	    new Sample().change();

	}

}
