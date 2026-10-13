package Automobile;

public class Test {

	
	public static void main(String[] args) {
		
		Vehicle v;
		v  = new Bike(); // upcasting
		
		if(v instanceof Car)
		{ // downcasting
			Car c = (Car) v;
			System.out.println("Car brand :"+c.brand+"\nCost :"+c.ccost);
		}
		
		else if(v instanceof Bike)
		{
			// downcasting
			Bike b = (Bike) v;
			System.out.println("Bike brand :"+b.brand+"\nCost :"+b.bcost);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
