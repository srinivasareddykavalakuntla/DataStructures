package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class SumFirstNLastN {
	public static void main(String[] args) {
		int[] a = {3,5,7,5,3,6,5};
		List<Integer> l= new ArrayList<>();
		for(int i=0;i<=a.length/2;i++) {
			l.add(a[i]+a[a.length-1-i]);
		}
		System.out.println(l);
	}
}
