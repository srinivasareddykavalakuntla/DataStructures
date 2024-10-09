package com.stack;

public class CustomStack<T> {
	int capacity;
	private T[] data;
	int top;
	
	
	@SuppressWarnings("unchecked")
	public CustomStack() {
		this.capacity = 10;
		data = (T[]) new Object[this.capacity];
		top = -1;
	}

	public boolean isEmpty() {
		return data.length == 0;
		// return top == -1;
	}

	public int getSize() {
		return top+1;
	}
	public CustomStack(int capacity, T[] data, int top) {
		super();
		this.capacity = capacity;
		this.data = data;
		this.top = top;
	}
	
	public void push(T val) throws Exception {
		if(getSize() == capacity)
			throw new Exception("No space");
		
			top++;
			data[top]=val;
	}
	
	public T peek() {
		if(isEmpty())
			return null;
		
		return data[top];
	}
	 
	public T pop() {
		if(isEmpty())
			return null;
		
		return data[top--];
	}

	public boolean search(T val) {
		if(isEmpty())
			return false;
		for(int i=0;i<=top;i++) {
			if(data[i] == val)
				return true;
		}
		return false;
		
	}
	
	void printStack() {
		if(isEmpty())
			System.out.println("empty");
		for(int i=0;i<=top;i++) {
			System.out.println(data[i]);
		}
	
	}
}
