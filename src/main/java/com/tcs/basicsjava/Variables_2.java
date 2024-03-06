package com.tcs.basicsjava;

public class Variables_2 {
	static int i;
	static short s;
	static byte b;
	static long l;
	static float f;
	static double d;
	static char ch;
	static boolean bln;
	static Variables_2 v2;
	String s2;

	static {
		i = 30;
	}
	{

		s2 = "yuvar";

	}

	public static void main(String[] args) {

		int m;
		m = 30;
		Variables_2.s = 40;
		System.out.println(m);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bln);
		System.out.println(v2);
		Variables_2 variables_2 = new Variables_2();
		System.out.println(variables_2.s2);
		variables_2.s2 = "chandra";
		System.out.println(variables_2.s2);

		/*
		 * int i =30; 03
		 * 
		 * 
		 */

	}

}
