package LinkedList;

public class Reverse {
	public LinkedList Reverse(LinkedList head){
		LinkedList p1=null;
		LinkedList	p2;
	
		while(head!=null){
			p2=head.getNext();
			head.setNext(p1);
			p1=head;
			head=p2;
			
		}
		return p1;
	}

}
