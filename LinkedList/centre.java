package LinkedList;

public class centre {
public LinkedList centre(LinkedList head){
	LinkedList p1,p2;
	p1=p2=head;
	while(p2!=null && p2.getNext()!=null){
		p1=p1.getNext();
		p2=p2.getNext().getNext();
		
	}
	return p1;
}
}
