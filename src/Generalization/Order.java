package Generalization;

public class Order {
	
	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
		Food obj = h.foodorder(4);
		Food f = new Idly();
		Food f1 = new Dosa();
		Food f2 = new Vada();
		
		if(obj instanceof Idly)
		{
			Idly i = (Idly) f;
			System.out.println("Odrered Idly");
			System.out.println("Idly price :"+i.icost);
			
		}
		else if(obj instanceof Dosa)
		{
			System.out.println("Ordered Dosa");
			Dosa d = (Dosa) f1;
			System.out.println("Dosa price :"+d.dcost);
		}
		else
		{
			Vada v = (Vada) f2;
			System.out.println("Ordered vada");
			System.out.println("Price :"+v.vcost);
		}
	}

}
