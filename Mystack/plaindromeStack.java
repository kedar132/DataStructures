package Mystack;

import java.util.Stack;

public class plaindromeStack {
	public static void main(String[] args){
		
		Stack<Character> ns=new Stack<Character>();
		String s="abxbaa";
		int i;
		for(i=0;i<s.length();i++){
			char c=s.charAt(i);
					if(c!='x'){
						ns.push(s.charAt(i));
					}
					else{
						i++;
						break;
					}
		}
		
		for(int j=i;j<s.length();j++){
			char c=s.charAt(j);
			if(ns.empty()){
				System.out.println("is not a palindrome");
				return;
			}
			if(c!=ns.pop()){
				System.out.println("is not a palindrome");
				return;
				
			}
		
	}

	System.out.println("is a palindrome");



}
}
