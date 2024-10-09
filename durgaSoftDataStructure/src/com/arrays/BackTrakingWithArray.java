package com.arrays;

import java.util.Arrays;

public class BackTrakingWithArray {

	public static void main(String[] args) {
		int[] a = new int[5];
		updateArray(a,0,1);
		System.out.println(Arrays.toString(a));
	}

	private static void updateArray(int[] a, int index, int val) {
		if(index == a.length) {
			System.out.println("return");
			return;
		}
		
		a[index]=val;
		updateArray(a,index+1,val+1);
		a[index]=a[index]-2;
	}

}
