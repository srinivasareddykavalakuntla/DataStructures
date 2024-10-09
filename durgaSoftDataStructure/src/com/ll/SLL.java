package com.ll;

public class SLL {
	
	int count;
	 Node head;
	Node tail;
	SLL(){
		count = 0;
		head = null;
		tail = null;
				
	}

	private class Node{
		int data;
		Node next;
		Node(){
			
		}
		Node(int data,Node next){
			this.data = data;
			this.next = next;
		}
	}

	public void add(int data) {
		Node node = new Node(data,null);
		if(head == null) {
			head = tail = node;
			return;
		}
		Node tmp = head;
		while(tmp.next !=null) {
			tmp=tmp.next;
		}
		tmp.next = node;
		
	}
	public static void main(String[] args) {
		SLL l1 = new SLL();
		l1.add(2);
		l1.add(12);
		//l1.add(3);
		
		
		SLL l2 = new SLL();
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(6);
		l2.add(9);
		//l2.add(4);
		addTwoNumbers(l1.head,l2.head);
		System.out.println("-----add to number------");
		mergeTwoSortedLL(l1.head,l2.head);
		System.out.println("-----merge two sorted ------");
		reverseBetween(l2.head, 2, 4);
		System.out.println("---- reverse b//w start and end-------");
		SLL dup = new SLL();
		dup.add(1);
		dup.add(2);
		dup.add(4);
		dup.add(4);
		dup.add(5);
		dup.add(6);
		dup.add(6);
		
		removeDuplicates(dup.head);
		System.out.println("-----remove duplicate------");
		
		SLL l3 = new SLL();
		l3.add(2);
		l3.add(3);
		l3.add(4);
		l3.add(5);
		l3.add(6);
		l3.add(9);
		rotate(l3.head);

	}
	public void print(Node tmp) {
		if(tmp == null) {
			return;
		}
		System.out.print(tmp.data +" ");
		print(tmp.next);
		
	}

	 public static void addTwoNumbers(Node l1, Node l2) {
		 SLL dummy = new SLL();
		 int total=0;
		 int carry =0;
		 while(l1!=null || l2!=null || carry!=0 ) {
			 total = carry;
			 if(l1!=null) {
				 total+=l1.data;
				 l1=l1.next;
			 }
			 if(l2!=null) {
				 total+=l2.data;
				 l2=l2.next;
			 }
			 int num = total%10;
			 carry = total/10;
			dummy.add(num);
		 }
		 
		  dummy.print(dummy.head);
		
	        
	    }
	 
	 public static void mergeTwoSortedLL(Node ll1,Node l2) {
		 Node l1 = new SLL().new Node();
		 l1 = ll1;
		 SLL dummy = new SLL();
		 while(l1 != null || l2 != null ) {
			 
			 if(l1 == null && l2 !=null) {
				 dummy.add(l2.data);
				 l2=l2.next;
				
			 }
			 else if(l1 != null && l2 ==null) {
				 dummy.add(l1.data);
				 l1=l1.next;
				
			 }
				 
			 else if(l1.data < l2.data) {
				 dummy.add(l1.data);
				 l1 = l1.next;
			 }
				/*
				 * else if(l1.data == l2.data) { dummy.add(l1.data); dummy.add(l2.data); l1
				 * =l1.next; l2 = l2.next; }
				 */else {
				 dummy.add(l2.data);
				 l2 = l2.next;
			 }
			 
			
			
		 }
		 dummy.print(dummy.head);
	 }
	 
	 public static void reverseBetween(Node head, int left, int right) {

		 SLL dummy = new SLL();
		 Node pre = head; 
		 
		 for(int i = 1;i<left-1;i++) {
			 pre = pre.next;
		 }
		
			Node curr = pre.next;
//			 [2,3,4,5,6,9]
			for(int i=0;i<right-left;i++) {
				Node forw = curr.next;
				curr.next = forw.next;
				forw.next = pre.next;
				pre.next = forw;
			}
				
		 dummy.print(head);
	    }
	 public static void removeDuplicates(Node head) {
		 SLL ll = new SLL();
		 Node tmp = head;
		 while(tmp !=null) {
			 if(tmp.next != null && tmp.data == tmp.next.data) {
				 tmp.next = tmp.next.next;
			 }else {
				 tmp = tmp.next;
			 }

		 }
		 ll.print(head);
	 }
	 
		public static void rotate(Node head) {

//		 [1,0,2]

			Node tmp = head;
			int c =0;
			while (tmp.next != null) {
				tmp = tmp.next;
				c++;
			}
			
			tmp.next = head;
			
			int k =3;
			int jump =c+1-k;
			tmp=head;
			while(jump>1) {
				tmp=tmp.next;
				jump--;
			}
			Node last =	tmp.next;
			tmp.next=null;
			
SLL sll = new SLL();
sll.print(last);
		}
}
