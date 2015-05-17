package Queue;

import java.util.Stack;

public class reverse {
public myQueue reverse(myQueue obj){
	Stack<Integer> s=new Stack<Integer>();
	while(!obj.isEmpty()){
		s.push(obj.dequeue());
	}
	while(!s.isEmpty()){
		obj.enqueue(s.pop());
	}
	return obj;
}
}
