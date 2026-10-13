package com;

public class Cafe {

	
	public static void main(String[] args) {
		
		Vendingmachine v = new Vendingmachine();
		Beverages b = new Tea();
		Beverages b1 = new Coffee();
		
	     Beverages obj = v.vmachine(2);
	     
	     if(obj instanceof Tea)
	     {
	    	 System.out.println("Tea odered");
	    	 Tea t = (Tea) b;
	    	 System.out.println("Price :"+t.tcost);
	     }
	     else if(obj instanceof Coffee)
	     {
	    	 System.out.println("Coffee odered");
	    	 Coffee c = (Coffee) b1;
	    	 System.out.println("Price :"+c.ccost);
	     }
	    
				
	}
}
