class base
{
	base()
	{
	System.out.println("Default constructor called");	
	}

	base(int x)
	{
	this();	
	System.out.println("Parameterized constructor called");	
	}
		
}
class Q2
{
	public static void main(String x[])
	{
	base obj = new base(10);
	}
}
