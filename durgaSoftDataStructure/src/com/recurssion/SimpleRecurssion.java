package com.recurssion;

public class SimpleRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(-3);
	}

	private static void m(int i) {
		
		if(i<=0)// to terminate or stop the flow, we need base condition
			return;
		
		System.out.println("method m");
		m(i-1);
		
	}

	
}
