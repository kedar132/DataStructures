package LinkedList;

public class evenOdd {
public boolean evenOdd(LinkedList head){
	LinkedList p=head;
	boolean even;
	//boolean odd;
	while(p.getNext()!=null){
		p=p.getNext().getNext();
		if(p==null){
			even =true;
			return even;
		}
	}
	return false;
}
}
