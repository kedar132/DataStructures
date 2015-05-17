package LinkedList;

public class listStart {
	public LinkedList Start(LinkedList head,boolean cycle){
		 LinkedList p1=null;
		 LinkedList p2=null;
		if(cycle ==true)
			p1=head;
			while(p1!=p2){
				p1=p1.getNext();
				p2=p2.getNext();
			
				
			}
			return p1;
			
		
		
	}

}
