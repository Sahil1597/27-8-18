class base
{
	void show()
	{
	System.out.println("Base function called");
	}
}

class derived extends base
{
	void display()
	{
	System.out.println("Derived function called");
	super.show();
	}
}

class Q1
{
	public static void main(String x[])
	{
	derived obj = new derived();
	obj.display();
	}
}