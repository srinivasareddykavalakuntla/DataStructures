package com.stack;

public class StackLinkedList<T> {
	
	Node<T> head;
	int size;
	@SuppressWarnings("hiding")
	class Node<T> {
		T data;
		Node<T> next;
		public Node(T data, Node<T> next) {
			super();
			this.data = data;
			this.next = next;
			size++;
		}
		
	}
	
	
	public StackLinkedList() {
		super();
		this.head = null;
		this.size = 0;
	}


	void push(T val ) {
		Node<T> newNode = new Node<T>(val , head);
		head = newNode;	
		size++;
	}
	
	T peek() {
		return head.data;
	}
	
	T pop() {
		T data = head.data;
		head = head.next;
		size --;
		return data;
		
	}
	boolean search(T val) {
		
		Node<T> tmp = head;
		
		while(tmp!=null) {
			if(val==tmp.data)
				return true;
			tmp = tmp.next;
		}
		return false; 
	}
}
