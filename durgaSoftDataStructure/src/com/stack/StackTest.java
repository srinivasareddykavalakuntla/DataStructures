package com.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) throws Exception {
		CustomStack<String> s = new CustomStack<>();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.printStack();
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search("b"));
		
		Stack<Integer> os = new Stack<>();
		sortedInsert(os,333);
		sortedInsert(os,111);
		sortedInsert(os,444);
		sortedInsert(os,666);
		
		os.push(222);
		os.push(999);
		os.push(777);
		sortElements(os);
		System.out.println(os);
		insertAtBottom(os,555);
		System.out.println(os);
		reverseStack(os);
		reverseStackString("srinivas");
		System.out.println( balanceParanthesis("[(])"));//[()]{}{[()()]()}
	
	}

	private static boolean balanceParanthesis(String str) {
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (!s.isEmpty()) {
				if (c == '}' && s.peek() == '{') {
					s.pop();

				} else if (c == ')' && s.peek() == '(') {
					s.pop();

				} else if (c == ']' && s.peek() == '[') {
					s.pop();

				} else {
					s.push(str.charAt(i));
				}
			} else {
				s.push(str.charAt(i));
			}

		}
		if (s.isEmpty())
			return true;
		else
			return false;

	}

	private static void reverseStackString(String str) {
		Stack<Character> s = new Stack<>();
		for(int i=0;i<str.length();i++) s.push(str.charAt(i));
		
		String reverseddata = reverseString(s,new StringBuilder());
		System.out.println(reverseddata);
	}

	private static String reverseString(Stack<Character> s, StringBuilder string) {
		
		if(!s.empty()){
			char c = s.peek();
			string.append(c);
			s.pop();
			reverseString(s,string);			
		}
		return string.toString();
	}

	private static void reverseStack(Stack<Integer> os) {
		
	}

	private static void insertAtBottom(Stack<Integer> os, int i) {
		int tmp;
		if(os.empty()) {
			os.push(i);
		}else {
			tmp = os.pop();
			insertAtBottom(os, i);
			os.push(tmp);
		}
	}

	private static void sortElements(Stack<Integer> os) {
		if(!os.isEmpty()) {
			int tmp = os.pop();
			sortElements(os);
			sortedInsert(os, tmp);
		}
		
	}

	private static void sortedInsert(Stack<Integer> os, int i) {
		int tmp;
		if(os.empty() || os.peek()<i) {
			os.push(i);
		}else {
			tmp = os.pop();
			sortedInsert(os,i);
			os.push(tmp);
		}
		
	}

}
