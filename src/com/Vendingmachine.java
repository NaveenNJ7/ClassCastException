package com;

public class Vendingmachine {

	
	Beverages vmachine(int choice)
	{
		if(choice==1)
		{
			Tea t = new Tea();
			return t;
		}
		else if(choice==2)
		{
			Coffee c = new Coffee();
			return c;
		}
		else
		{
			return null;
		}
	}
}
