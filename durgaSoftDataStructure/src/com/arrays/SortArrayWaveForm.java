package com.arrays;

import java.util.Arrays;

public class SortArrayWaveForm {

	public static void main(String[] args) {
 int a[]={0,1,2,3,4,5};// 11 10 13 12 14
 System.out.println(a[a.length-1]);
 for(int i=0;i<a.length-1;i+=2) {
	 int tmp = a[i];
	 a[i]=a[i+1];
	 a[i+1]=tmp;
 }
 System.out.println(Arrays.toString(a));

	}

}
