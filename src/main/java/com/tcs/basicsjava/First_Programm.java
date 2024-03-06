package com.tcs.basicsjava;

public class First_Programm {

	public static void main(String[] args) {
		System.out.println("This is my first program");
		System.out.println(10+20);// 30
		System.out.println(10+20+"hello"); //30hello
		System.out.println(10+20+"hello"+30+30); //30hello3030 // interview 1
		System.out.println("hi" + " hello");
		System.out.println('a'+'b'+'c'); //294
		System.out.println(0+'a');
		System.out.println('a'+1.2);
		System.out.println("hello" + 10*20 ); // interview 2 
		System.out.println((byte)300);
		System.out.println(22.0/7);
		System.out.println((22.0f/7.0f));
		System.out.println(DataTypes.num);
		System.out.println(VariablesScope.number);
//		VariablesScope sc = new VariablesScope();
//		System.out.println(sc.number2);
		System.out.println(VariablesScope.sc.number2);
		VariablesScope.sc.visible();
	}
}
