package com.arrays;

public class FirstRepetingElement {

	public static void main(String[] args) {
		int [] a = {4,1,2,5,2,3,2,7,4,1,6,5,6};
		
		oi:for(int i=0;i<a.length;i++) {
		  for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(i);
					break oi;
				}
			}
		}
	
		for(int i=0;i<a.length;i++) {
			boolean isrep = true; 
			  oj:for(int j=0;j<a.length;j++) {
					if(i!=j && a[i]==a[j]) {
						isrep = false;
						break oj;
					}
				}
			  if(isrep) {
				 System.out.println(a[i]);
			  break;
			  }
			}
	}

}
