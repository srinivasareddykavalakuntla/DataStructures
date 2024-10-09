package com.ll;

public class DLL<T> {
	Node head;
	int size;

	public DLL() {
		this.head = null;
		this.size = 0;
	}

	@SuppressWarnings("unused")
	private class Node {
		T data;
		Node prev;
		Node next;

		public Node(T data, Node prev, Node next) {
			super();
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

	}
	
	public int size() {
		return this.size;				
	}

	public static void main(String[] args) {
		

	}

}
