package Examples;

public class Test {

	
	public static void main(String[] args)
	{
		
	/*	Son s = new Son();
		Daughter d = new Daughter();
		Father f = new Father();
		
		System.out.println(s instanceof Son); // true
		System.out.println("-------");
		System.out.println(new Daughter() instanceof Daughter); // true
		System.out.println("-------");
		System.out.println(new Son() instanceof Father); // inheriting father class // true
		System.out.println("-------");
		System.out.println(new Father() instanceof Son); // false         */
		
		
		// first we declared and initialized
		Father f;
		f  = new Daughter();   // father has properties of son because son object is storing its address into father class
		
		if(f instanceof Son)
		{
			System.out.println("Downcasting to Son explicitly");
			Son s = (Son) f;
			System.out.println("Father name :"+s.fname+" and his age :"+s.fage+"\nSon name :"+s.sname+" and his age :"+s.sage);
		}
		else if(f instanceof Daughter)
		{
			System.out.println("Downcasting to Daughter explicitly");
			Daughter d  = (Daughter) f;
			System.out.println("Father name :"+d.fname+" and his age :"+d.fage+"\nDaughter name :"+d.dname+" and her age :"+d.dage);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
