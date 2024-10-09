package com.sortingAlgo;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		int [] a = {7,3,2,8};
//		int [] a = new int[2000000];
//		 Random rand = new Random();
//		for(int i=0;i<2000000;i++) {
//			a[i]= rand.nextInt(2000000);
//		}
		
		
//		{3,7,2,8}	{9,5,1,4,6};
//		
//		{3,7}{,2,8}  {9,5,}{1,4,6};
//		
//		{3,}{7}{,2}{,8} {9}{,5,} {1},{4,6};
//									{4}{,6};
		//System.out.println(Arrays.toString(a));
		mergeSort(a,a.length);
		System.out.println(Arrays.toString(a));

	}

	private static void mergeSort(int[] a, int n) {
		if(a.length == 1)
			return;
		int i,mid=n/2;
		int[] l = new int[mid];
		int[] r = new int[n-mid];
		
		for(i=0;i<mid;i++) 
			l[i]=a[i];		
		for(i=mid;i<n;i++)
			r[i-mid]=a[i];
		
		mergeSort(l,l.length);
		mergeSort(r,r.length);
		merge(a,l,r,l.length,r.length);
		
	}

	private static void merge(int[] a, int[] l, int[] r, int left, int right) {
		int i=0,j=0,k=0;
		
		while(i<left && j<right) {
			if(l[i]<r[j]) {
				a[k++]=l[i++];
			}else
				a[k++]=r[j++];
		}
		while(i<left) {
			a[k++]=l[i++];
		}
		while(j<right) {
			a[k++]=r[j++];
		}
		
	}

}
