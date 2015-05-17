package LinkedList;

public class nodeInsert {
	public LinkedList nodeInsert(LinkedList head,LinkedList NodetoInsert){
		if(head==null){
			head= NodetoInsert;
			return head;
		}
		
		
		LinkedList temp=head;
		LinkedList newNode=null;
		if(head.getData()>NodetoInsert.getData()){
			NodetoInsert.setNext(head);
			head=NodetoInsert;
			return head;
		}
		while(temp.getData()<NodetoInsert.getData()){
			newNode=temp;
			temp=temp.getNext();
			if(temp==null){
				newNode.setNext(NodetoInsert);
				return head	;
				
			}
		}
		newNode.setNext(NodetoInsert);
		NodetoInsert.setNext(temp);
		return head;
		
	}

}
