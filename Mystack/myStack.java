package Mystack;

public class myStack {
	private int top;
	private char[] array;
	public myStack(){
		array=new char[32];
		top=-1;
		
	}
	public boolean isEmpty(){
		if(top==-1)
		   return true;
		else {
			return false;
		}
	}
	public boolean isFull(){
		if(top==31);
		return true;
		
	}
	public void push(char data){
	
		
			array[++top]=data;
		
	}
	public char pop(){
			return(array[top--]);
	}

}
