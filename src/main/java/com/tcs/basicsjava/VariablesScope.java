package com.tcs.basicsjava;

public class VariablesScope {

	static int number = 20; // static variable
	int number2 = 50; // non static varible
	final static VariablesScope sc = new VariablesScope();


	static {

		System.out.println("am inside a static block");
		int i = 20;
		System.out.println(i);

	}
	{
		int k = 30;
		System.out.println(k);
		
		

	}

	public static void main(String[] args) {

		VariablesScope obj = new VariablesScope();
		obj.number2=90;
		System.out.println(obj.number2);
		VariablesScope obj1 = new VariablesScope();
		obj1.number2=150;
		System.out.println(obj1.number2);
		VariablesScope obj2 = new VariablesScope();
		System.out.println(obj2.number2);
		
		obj.number=250;
	    VariablesScope.number=500;
		System.out.println(obj2.number);
		System.out.println(obj1.number);
		System.out.println(obj.number);
		sc.visible();
	}

	public  void visible() {
		// System.out.println(i);
		System.out.println("am inside the visible code");
		System.out.println(VariablesScope.number);
		VariablesScope obj = new VariablesScope();
		System.out.println(obj.number2);

	}

}
