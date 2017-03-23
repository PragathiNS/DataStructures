//LinkedList implementation of Queue

public class Queue<AnyType> {
	private Node<AnyType> front, rear;
	private int size;
	
	//Empty Queue
	public Queue() {
		size = 0;
		front = rear = null;
	}
	
	//Return true if the queue is empty
	boolean isEmpty(){
		return (size == 0);
	}
	
	//Returns the size of the queue
	public int size(){
		return size;
	}
	
	//Adds the element to the queue at the rear end
	public void enqueue(AnyType data){
		Node<AnyType> newNode = new Node<AnyType>(data);
		if(isEmpty()){
			front = newNode;
		}
		else{
			rear.next = newNode;
		}
		rear = newNode;
		size++;
	}
	
	//Removes element from the front end and prints the removed element
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is already empty");
		}
		AnyType dataRemove = front.data;
		System.out.println("The element removed is " + dataRemove);
		front = front.next;
		size--;
	}
	
	//Returns the data of the first element
	public AnyType front(){
		if(isEmpty())
			System.out.println("Empty Queue");
		AnyType firstElement = front.data;
		return firstElement;
	}
	
	//Displays the Queue as a String
	public String toString(){
		String result = "";
		Node<AnyType> current = front;
		while (current != null){
			result = result + current.data + " ";
			current = current.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Queue<Integer> que = new Queue<Integer>();
		int n = 10;
		for(int i = 0; i < n; i++){
			que.enqueue(i);
		}
		//String out = que.toString();
		System.out.println("Initial Queue: " + que.toString());
		System.out.println("Initial size: " + que.size());
		for(int i = 3; i < 6; i++){
			que.dequeue();
		}
		int firstData = que.front();
		System.out.println(firstData);
		System.out.println("Final Queue: " + que.toString());
		System.out.println("Final size: " + que.size());
		
		
		Queue<String> queString = new Queue<>();
		queString.enqueue("first");
		queString.enqueue("second");
		System.out.println("Initial Queue: " + queString.toString());
		queString.dequeue();
		System.out.println("Final Queue: " + queString.toString());
		
	}

}
