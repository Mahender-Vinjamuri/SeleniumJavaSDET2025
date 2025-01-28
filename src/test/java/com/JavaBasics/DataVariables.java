package com.JavaBasics;

public class DataVariables {
	
	int a = 10;     //instance variable - declare inside the class but outside the method
	char c = 'A';
	static String str = "Aaradhya";  //static variable
	public int sum(int a, int b)
	{
	return a + b;
	}

	public static void main(String[] args) {
		
		int a = 50;   //local variable which declare inside the method
		DataVariables obj = new DataVariables();
		System.out.println(obj.a);
		System.out.println(obj.c);
		System.out.println(str);
		System.out.println(obj.sum(10, 20));
		System.out.println(a);
		

	}

}
