package LinkedList;

public class cycleorNot {
	
	 LinkedList p1;
	 LinkedList p2;
	
	public boolean cycle(LinkedList head){
		 
		p1=p2=head;
		while(p2!=null && p2.getNext()!=null){
			p1=p1.getNext();
			p2=p2.getNext().getNext();
			if(p1==p2){
				return true;
			}
		}
		return false;
	}
public LinkedList Start(LinkedList head,boolean cycle){
	
	if(cycle ==true)
		p1=head;
		while(p1!=p2){
			p1=p1.getNext();
			p2=p2.getNext();
		
			
		}
		return p1;
		
	
	
}
public int loopcount(LinkedList first){
	p1=p2=first;
	p2=p2.getNext();
	int count=1;
	while(p1!=p2){
	p2=p2.getNext();
	count++;
	}
	return count;
}
}

