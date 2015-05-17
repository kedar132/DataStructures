package Mystack;

import java.util.Stack;

public class minStack {
	
	Stack<Integer> ns=new Stack<Integer>();
	Stack<Integer> nm=new Stack<Integer>();
	
	public void push(int data){
		if(ns.empty()){
			ns.push(data);
			nm.push(data);
		}
		else{
			ns.push(data);
			int temp=nm.pop();
			if(temp<data){
			nm.push(temp);
		}
		else{
			nm.push(data);
			
		}
	}
	}
	
	public int pop(){
		return nm.pop();
	}
	
	public static void main(String[] args){
		minStack ob=new minStack();
		ob.push(10);
		ob.push(23);
		ob.push(65);
		ob.push(1);
		ob.push(-1);
		System.out.println(ob.pop());
	}
}
