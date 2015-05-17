package Queue;

public class myQueue {
	
	public int front;
	public int rear;
	public int capacity;
	public int[] array;
	public myQueue(){
		
	}
	public myQueue(int size){
		capacity=size;
		front=-1;
		rear=-1;
		array =new int[capacity];
	}
	public boolean isFull(){
		if((rear+1)%capacity==front)
			return true;
		else
			return false;
	}
	public boolean isEmpty(){
		if (front==-1)
			return true;
		else
			return false;
	}

	public void enqueue(int data){
		if(isFull())
			System.out.println("queue is full");
		else{
			rear=(rear+1)%capacity;
			array[rear]=data;
			if(front==-1){
				front=rear;
			}
		}
		
			
			
		}
	public int dequeue(){
		int temp=0;
		if(isEmpty()){
			System.out.println("queue is empty");
		return -1;
		}
		else{
			temp=array[front];
			if(front==rear){
				front=-1;
			}
			else{
			front=(front+1)%capacity;
			}
		}
		return temp;
	}
//	public static void main(String[] args){
		//myQueue ob=new myQueue(4);
		//reverse obj=new reverse();
		
		
		/*ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);
		ob.enqueue(4);
		//obj.reverse(ob);
		System.out.println(ob.dequeue());
		System.out.println(ob.dequeue());
		System.out.println(ob.dequeue());
		System.out.println(ob.dequeue());
		//System.out.println(ob.dequeue());
		//System.out.println(ob.dequeue());*/
	//}
}
