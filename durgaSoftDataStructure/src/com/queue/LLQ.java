package com.queue;

class LLQQ {

	Node front, back;
	int count;

	LLQQ() {
		this.front = null;
		this.back = null;
		this.count = 0;
	}

	class Node {

		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	void insert(int val) {
		Node newNode = new Node(val, null);
		if (front == null && back == null) {
			front = newNode;
			back = newNode;
		} else {
			back.next = newNode;
			back = newNode;
		}
		count++;
	}

	void delete() {
			
		if(front == null) {
			System.out.println("Q is empty");
			return;
		}else {
			front = front.next;
			count--;
		}
	}
	
	void display() {
		Node tmp = front;
		
		while(tmp!=null) {
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
	}
}

public class LLQ {

	public static void main(String[] args) {
		LLQQ q = new LLQQ();
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.display();
		q.delete();
		q.delete();
		q.display();

	}

}
