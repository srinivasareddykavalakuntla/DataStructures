package com.sortingAlgo;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int [] a = {3,1,2,8};
		
		int tmp,j;
		for(int i =1;i<a.length;i++) {
			tmp=a[i];
			for(j=i;j>0 && a[j-1]>tmp ;j--) {
					a[j] = a[j-1]; 
			}
			
			a[j]=tmp;
		}
System.out.println(Arrays.toString(a));
	}

}
