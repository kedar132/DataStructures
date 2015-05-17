package Mystack;

public class infixtoPostfix {
	public static void main(String[] args){
		String s= "(A+B)+(C+D)";
		
		myStack ms=new myStack();
		for (int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c==')')
			{
				while(!ms.isEmpty()){
					if(c!='(')
						System.out.print(ms.pop());
					else
						ms.pop();
					break;
				}
			}
			else if(c=='('){
				while(!ms.isEmpty()){
					if(c!='('){
						System.out.print(ms.pop());
					}
					else{
					ms.pop();
					//ms.push(c);
					break;
					}
				}
			
		}
			
			else if(c=='*' || c=='/'){
				
				while(!ms.isEmpty()){
					if(c=='('){
						ms.pop();
						break;
						
					}
					else if(c=='+' || c=='-'){
						
					System.out.print(ms.pop());
					break;
					}
					
					else{
						
					System.out.print(ms.pop());	
					}
					
				}
				ms.push(c);
		   }
			else if(c=='+' || c=='-'){
				ms.push(c);
				
				
			}
			
			
			else{
				System.out.print(c);
			}
		}
		
		while(!ms.isEmpty()){
			
			System.out.print(ms.pop());
		}
}
}	
	
