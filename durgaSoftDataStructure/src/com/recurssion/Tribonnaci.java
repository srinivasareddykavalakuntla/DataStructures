package com.recurssion;

public class Tribonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(	tribo(4));
	}

	private static int tribo(int i) {
		System.out.println(i);
		if(i<=2)
			return i;	
		
		
		return tribo(i-1) + tribo(i-2) + tribo(i-3);
	}
}
