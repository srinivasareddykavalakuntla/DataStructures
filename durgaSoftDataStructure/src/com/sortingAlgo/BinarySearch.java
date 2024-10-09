package com.sortingAlgo;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6,7};
		 binarySearch(a,6,0,a.length-1);

	}

	private static void binarySearch(int[] a, int i,int low,int high) {
		
		int mid = (low+high)/2;
		if(a[mid] == i)
		System.out.println(mid);
		else if(a[mid]>i) {
			binarySearch(a,i,low,mid-1);
		}else {
			binarySearch(a,i,mid+1,high);	
		}
		
		//return -1;
	}

}
