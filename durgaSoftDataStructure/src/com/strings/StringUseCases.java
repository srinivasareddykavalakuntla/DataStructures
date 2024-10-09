package com.strings;

public class StringUseCases {

	public static void main(String[] args) {
		String s = "abc";//SCP
		
		String s1 = s.toString(); // return same scp;
		System.out.println(s == s1);
		
		String a = new String("abc"); // one in SCP  "abc" and new object in heap
		String b = a.toString();
		String uppercase = a.toUpperCase();
		String lowercase = a.toUpperCase();
		System.out.println(a==uppercase); // false because content is changes
		System.out.println(a==lowercase);// true  
		a.concat("def");// will create new object in heap
		
		String scp="abc";
		scp.concat("d"); // abcd also will create in scp bcz scp is in SCP area
		System.out.println(scp);
		String s5 ="I love you";
		String s8 = "I love" + " you";
		System.out.println(s5 == s8); // bcz compile will check already "I love you"; is present ans s8 will point out to s5
		String s6 = "I love";
		
		String s7 = s6+ " you";
		System.out.println(s8 == s7); // here s6 will be executed at runtime so it will create new memory in SCP
		// so s5,s8 are not equal to s7
		
		final String s9 = "I love";
		
		String s10 = s9+ " you";
		
		System.out.println(s10 == s5);
		// but here s9 is final, so compiler can able to complie and compile time and assign
		// s10 to s5,s8
		
		String a1="abc";
		String a2 = a1+"def";
		a1=null;
		System.out.println(a2);
		System.gc();
		
		

	}

}
