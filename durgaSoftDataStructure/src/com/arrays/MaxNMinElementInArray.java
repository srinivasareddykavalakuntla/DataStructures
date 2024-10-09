package com.arrays;

public class MaxNMinElementInArray {

	public static void main(String[] args) {
		int[] e = {5,6,10,11,3,1,9};
	System.out.println(max(e));
	System.out.println(recurrsionmax(e,0,e.length));
	}

	private static int recurrsionmax(int[] e, int i, int length) {
		if(length==1)
			return e[i];
		
		return Math.max(e[i], recurrsionmax(e, i+1, length-1));
		
		
	}

	private static int max(int[] e) {
		// TODO Auto-generated method stub
		int max=e[0];
		for(int i=1;i<e.length;i++) {
			max = Math.max(max, e[i]);
		
		}
		return max;
	}

}
