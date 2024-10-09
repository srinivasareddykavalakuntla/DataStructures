package com.queue;

class Queue
{
	int[] data;
	int back,front;
	int cap;
	public Queue() {
		super();
	
		this.back = -1;
		this.front = -1;
		this.cap = 5;
		this.data = new int[this.cap];
	}
	
	void insert(int val){
		
		if(back == cap) {
			System.out.println("queue is full ");
			return;
		}
		if(back == front) 
			front = back =0;
		
		data[back++] = val;
		
	}

	public void display() {
		for(int i=front;i<back;i++) {
			System.out.println(data[i]);
		}
		
	}

	public void delete() {
		if(back == front) {
			System.out.println("Q is empty");
		}
		
		System.out.println("deleted item" +data[front++]);
		if(front==back) {
			front=back=-1;
		}
		
	}

}
class NQ 
{
	public static void main(String[] args) 
	{
		Queue q = new Queue();
		q.insert(11);
		q.insert(22);
		q.insert(33);
		q.insert(44);
		q.insert(55);
		q.insert(55);
		q.display();
		q.delete();
		q.display();
	}
}