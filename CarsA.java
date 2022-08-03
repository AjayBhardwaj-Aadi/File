class Cars
{
public void GetCars()
{
System.out.println("Get Cars");
}
}
class Honda extends Cars
{
	public void carCategory()
	{
		System.out.println("Honda");
	}	
}
class verna extends Cars
{
	public void carCategory()
	{
		System.out.println("Verna");
	}
}

 class CarsA
{
	public static void main (String args[])
		{
		Honda honda = new Honda();	
		honda.GetCars();
		honda.carCategory();
		
		
		
		verna verna = new verna();
		verna.GetCars();
		verna.carCategory();
	}
}

	