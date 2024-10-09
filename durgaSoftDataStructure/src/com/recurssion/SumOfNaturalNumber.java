package com.recurssion;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		sum(3);
		
		
		System.out.println(3 * (3 + 1) / 2);   
	}

	private static int sum(int i) {

		if (i <= 0)
			return i;

		System.out.println("i:" + i);
		i += sum(i - 1);
		System.out.println(i);
		return i;
	}

}
