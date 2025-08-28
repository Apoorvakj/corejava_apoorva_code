package org.tnsif.sf.c2fc.finaldemo;

//upi app transaction limit
class UPI
{
	final int Max_Daily_limit=100000;

	
	void showLimit()
	{
		System.out.println("Daily transfer limit : "+Max_Daily_limit);
	}
}

public class finalVariableDemo {



	public static void main(String[] args) {
		UPI obj=new UPI();
		obj.showLimit();
	
	}

}


