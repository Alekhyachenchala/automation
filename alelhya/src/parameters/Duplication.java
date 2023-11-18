package parameters;

public class Duplication 
{
	int speed1=1;
	int speed2=2;
	public void runforspeed1() 
	{
		System.out.println(speed1);
	}
	public void runforspeed2() 
	{
		System.out.println(speed2);
		
	}
	public static void main(String[] args)
	{
		
		Duplication obj=new Duplication();
		obj.runforspeed1();
		obj.runforspeed2();
	}

}
