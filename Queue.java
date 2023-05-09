/*
 * This java program implement queue using linked list with function EnQueue,DeQueue and Print Queue
 */
package workshop2;

/**
 * 
 * @author Kaif
 *
 */

/*
 * We are implementing queue using linked list hence creating class node for node information
 * of linked list
 */
class Node{
	
	/*
	 * Node consist of two thing data and next pointer which points next data in linked list
	 */
	int data;
	Node next;
	
	/*
	 * To define constructor for node; 
	 */
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

/*
 * To define methods for queue functions we are creating helper class
 */
class Queue2{
	
	/*
	 * To declare front and rear nodes because queue  consist with front and rear node
	 */
	Node front,rear;
	
	/*
	 *To define constructor for front and rear  
	 */
	public Queue2() {
		super();
		this.front = null;;
		this.rear = null;
	}
	
	/*
	 * To define enqueue method to insert data into queue we always insert data in queue from
	 * rear
	 */
	public void enqueue(int data) {
		
		/*
		 * To creat new node with new value
		 */
		Node temp = new Node(data);
		
		/*
		 * If rear is null that means our queue is empty and we have to create first new node
		 * for rear
		 */
		if(rear==null) {
			/*
			 * We are intializing first node of queue then hence rear and front should be same for
			 * first node
			 */
			rear=front=temp;
		}
		/*
		 * If there is a value in queue then new node will be created on last rear node 
		 */
		rear.next=temp;
		rear = temp;
	}
	/*
	 * To define dequeue function which delete a value from front node
	 */
	public void dequeue() {
		/*
		 * If front is null that means our queue is empty
		 */
		if(front==null) {
			/*
			 * If front is null no element in queue hence rear should also point to null
			 */
			front=rear;
			return;
		}
		else {
			/*
			 * If there are elemnts in queue then to delete the front node by changing the front
			 * to its next node; 
			 */
			front = front.next;
		}
	}
	
	/*
	 * To define printQueue method which will display the elements of queue 
	 */
	public void printQueue() {
		/*
		 * If front is null that means queue is empty
		 */
		if(front==null) {
			System.out.println("Queue is empty");
		}
		else {
			/*
			 * To iterate whole queue saving front value in temp node
			 */
			Node temp = front;
			/*
			 * To iterate whole queue till temp points null
			 */
			while(temp!=null) {
				/*
				 * To display element
				 */
				System.out.print(temp.data+"->");
				/*
				 * To move towards next node of queue
				 */
				temp = temp.next;
			}
			System.out.println();
		}
	}
}

/*
 * This is main class of program 
 */

public class Queue {
	
	/**
	 * This is main method of our program and starting point of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		/*
		 * To create Queue2 class object queue 
		 */
		
		Queue2 queue = new Queue2();
		
		
		/*
		 * To insert data in queue
		 */
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		/*
		 * Print queue
		 */
		queue.printQueue();
		
		/*
		 * To delete element from queue
		 */
		queue.dequeue();
	    queue.printQueue();
	    
		queue.dequeue();
		queue.printQueue();
		
		queue.dequeue();
		queue.printQueue();



	}

}
