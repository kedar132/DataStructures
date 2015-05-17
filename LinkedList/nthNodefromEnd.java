package LinkedList;

public class nthNodefromEnd {
public LinkedList nthNodefromEnd(LinkedList head,int n){
	LinkedList p1=head;
	LinkedList p2=head;
	for(int i=0;i<n;i++){
		p2=p2.getNext();
		}
	while(p2!=null){
		p1=p1.getNext();
		p2=p2.getNext();
	}
	return p1;
}
}
