package variables;

public class Data_type 
{
	int a=20;
	double price=630.139;
	
	public void method1()
	{
		String name="alekhya";
		System.out.println(name);
		System.out.println(name.startsWith("a"));
	}
    public void method2()
    {
        String name="vamshi";
        System.out.println(name);
    }  
    public void method3()
    { 
    	String name="kanchanapally";
    	System.out.println(name);
    }
	public static void main(String[] args) 
	{
		 int x=new Data_type().a;
		   System.out.println(x);
		   
		   double y=new Data_type().price;
		   System.out.println(y);
		   
		   new Data_type().method1();
		   new Data_type().method2();
		   new Data_type().method3();

	}

}
