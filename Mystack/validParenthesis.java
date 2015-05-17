package Mystack;

public class validParenthesis {
	public static void main(String[] args){
		String s= "{}{[a(b)c]";
		boolean isValid =true;
		myStack ms=new myStack();
		for (int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='('||c=='['||c=='{'){
				ms.push(c);
			}
			else{
				if(c==')'||c==']'||c=='}'){
					char d=ms.pop();
					if(d!='(' && c==')'){
						isValid=false;
					break;
					}
					if(d!='[' && c==']'){
						isValid=false;
						break;
					}
					if(d!='{' && c=='}'){
						isValid=false;
						break;
					}
				}
				
			}
	}
		
		if(ms.isEmpty()==false){
			isValid=false;
			
		}
		System.out.println(isValid);
	}

}
