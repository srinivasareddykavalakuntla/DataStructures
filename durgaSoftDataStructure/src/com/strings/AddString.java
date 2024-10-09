package com.strings;

public class AddString {

	public static void main(String[] args) {
		String s1 = "127";
		String s2 = "4599";
		
		int l1 = s1.length()-1;
		int l2 = s2.length()-1;
		int carry = 0;
		String ans="";
		while(l1>=0 || l2>=0) {
			int c=0;
			if(l1<0) {
				c=  (s2.charAt(l2)-48)+carry;
			}else if (l2<0) {
				c= (s1.charAt(l1)-48)+carry;
			}
			else
			c= (s1.charAt(l1)-48 )+ (s2.charAt(l2)-48)+carry;
			
			
			int m =c%10;
			ans = m+ans;
			carry = c/10;
			System.out.println(ans);
			l1--;l2--;
		}

	}

}
