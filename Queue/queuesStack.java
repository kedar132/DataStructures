package Queue;

import java.util.Stack;

public class queuesStack {
	myQueue s=new myQueue(5);
	myQueue s1=new myQueue(6);
	int count=1;
	public void push(int data){
		if(s.isEmpty()){
			s.enqueue(data);
		}
		else if(!s.isEmpty()){
			s.enqueue(data);
		}
		if(s.isFull()){
		while(!s.isEmpty()){
			//System.out.println("-------");
			s1.enqueue(s.dequeue());
			count++;
		}
		}
		while( count>0){
			System.out.println("-------");
			s1.enqueue(s1.dequeue());
			count--;
		}
				
			
		}
	public int pop(){
		if(s1.isEmpty()){
			System.out.println("stack is empty");
		}
		while(!s1.isEmpty()){
			return s1.dequeue();
		}
		return -1;
	}
	public static void main(String[] args){
		queuesStack obj=new queuesStack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.pop();
		obj.pop();
		obj.pop();
	}
	}
