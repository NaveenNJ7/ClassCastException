package Generalization;

public class Hotel {

	
	Food foodorder(int choice)
	{
		if(choice ==1)
		{
		Idly i = new Idly();
		
		return i;
		}
		else if(choice==20) {
			
			Dosa d = new Dosa();
			
			return d;
		}
		else
		{
			Vada v = new Vada();
			
			return v;
		}
	
	}
}
