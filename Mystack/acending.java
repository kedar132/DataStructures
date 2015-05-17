package Mystack;

import java.util.Stack;

public class acending {
	public static void main(String[] args){
		//acending ob=new acending();
		Stack<Integer> S=new Stack<Integer>();
		S.push(4);
		S.push(7);
		S.push(1);
		S.push(11);
		S.push(3);
		S.push(0);
		

	Stack<Integer> S1=new Stack<Integer>();
	
	while(!S.isEmpty()){
		int temp;
		temp=S.pop();
		int temp1=S.pop();
		
		if(temp<temp1){
			S1.push(temp);
		}
		else{//(S.peek()<temp){
		S1.push(temp1);
		S.push(temp);
		}
		
	
	
	while(!S1.isEmpty()){
		S.push(S1.pop());
	}
	while(!S.isEmpty()){
		System.out.println(S.pop());
	}
	}
}

	
	

}
