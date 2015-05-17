package LinkedList;

public class swapPair {
	public LinkedList swapPair(LinkedList head){
		LinkedList p1,p2;
		p1=head.getNext();
		p2=p1.getNext();
		p1.setNext(head);
		head.setNext(p2);
		head=p1;
		p1=head.getNext();
		while(p2!=null && p2.getNext()!=null){
			LinkedList Last=p1;
			p1=p1.getNext();
			p2=p1.getNext();
			LinkedList temp=p2.getNext();
			Last.setNext(p2);
			p2.setNext(p1);
			p1.setNext(temp);
			p2=temp;
		}
		return head;
	}

}
