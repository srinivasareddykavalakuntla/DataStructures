package com.strings;

import java.util.HashMap;
import java.util.Map;

public class FindPattern {

	public static void main(String[] args) {
	String[] l = {"abc","acc","vac"};
	String patter ="cdd";
	Map<Object, Object> m1 = new HashMap<>();
	for (int i = 0; i < l.length; i++) {
		boolean flag = true;
		m1.clear();
		in:for (int j = 0; j < l[i].length(); j++) {
			char p = patter.charAt(j);
			char c= l[i].charAt(j);
				if(!m1.containsKey(p) && !m1.containsValue(c)) {
					m1.put(p,c);
				}
				
				if(m1.containsKey(p) && !m1.get(p).equals(c)) {
					flag = false;
					break in;
				}
				if(!m1.containsKey(p) && m1.containsValue(c)) {
					flag = false;
					break in;	
				}
			
		}
		if(flag)
			System.out.println(l[i]);
		
	}

	}

}
