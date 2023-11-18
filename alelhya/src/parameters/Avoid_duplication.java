package parameters;

public class Avoid_duplication 
{
	public void run(int km) 
	{
		System.out.println(km);
	}
	public static void main(String[] args) 
	{
		Avoid_duplication obj=new Avoid_duplication();
	    obj.run(10);
	    obj.run(25);

	}

}
