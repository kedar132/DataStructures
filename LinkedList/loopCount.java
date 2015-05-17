package LinkedList;

public class loopCount {
	public int loopcount(LinkedList first){
		LinkedList p1=null;
		 LinkedList p2=null;
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
