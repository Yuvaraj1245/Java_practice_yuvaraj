package com.tcs.basicsjava;

public class DataTypes {

	final static int num=100;
	
	public static void main(String[] args) {

		/*
		 * int i,j,k; i=j=k=50; //i=40;j=60; //k=80;
		 * 
		 * 
		 * System.out.println(i); System.out.println(k); System.out.println(j);
		 */

		// swap the given numbers
		/**
		 * int i =10; int j =20;
		 * 
		 * int temp=j; //20 j=i; //10 i=temp;//20
		 */

		// swap the given numbers without using 3rd variable
		
		
		int i=10,j=20;
		i=i+j; //30
		j=i-j; //10
		i=i-j; //20
		
		System.out.println(i);
		System.out.println(j);
		
		// 2nd interview programm
		
		int a=10;
		String b="10";
		int num=Integer.parseInt(b);
		System.out.println(a+b); //1010
		System.out.println(a+num); //20
	

	}

}
