package method;

public class Sample2 
{
	public static void signin() 
	{
		System.out.println( "signin ");

	}
	
	public void change()
	{
		System.out.println("change");
	}
	public static void main(String[] args) 
	{
		Sample2.signin();
	    new Sample2().change();

	}

}
