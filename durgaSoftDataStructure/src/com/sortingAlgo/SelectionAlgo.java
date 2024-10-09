package com.sortingAlgo;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class SelectionAlgo {

	public static void main(String[] args) {

		int [] a = new int[100000];
		 Random rand = new Random();
		for(int i=0;i<100000;i++) {
			a[i]= rand.nextInt(1000000);
		}
		
		
		System.out.println(new Date().getTime());
		for(int i=0;i<a.length;i++) {
			int maxIndex = 0;
			for(int j=1;j<a.length-i;j++) {
				if(a[maxIndex]<a[j])
					maxIndex =j;
			}
			int tmp = a[maxIndex];
			a[maxIndex]=a[a.length-1-i];
			a[a.length-1-i]= tmp;
		}
			
//		for(int i =0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					int tmp = a[i];
//					a[i]=a[j];
//					a[j]=tmp;
//				}
//			}
//		}
		System.out.println(Arrays.toString(a));
		System.out.println(new Date().getTime());
	}

}
