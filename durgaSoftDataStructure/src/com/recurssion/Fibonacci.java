package com.recurssion;

public class Fibonacci {
	static int n3 =0,n1=0,n2=1;
	
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
	System.out.println(fibo(20));
	System.out.println(System.currentTimeMillis());
	System.out.println(fibo1(20));
	System.out.println(System.currentTimeMillis());

	}

	private static int fibo(int i) {
		if(i<=1)
			return i;	
		
		
		return fibo(i-1) + fibo(i-2);
	}
	
	private static int fibo1(int i ){
		
		
		for(int j=2;j<=i;j++) {
			
			n3 = n1+n2;
			n1=n2;
			n2=n3;
		}
	return n3;
		
		
	}

}
