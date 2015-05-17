package LinkedList;



public class LinkedList {
	public int data;
	public LinkedList next;
	public LinkedList previous;
	public LinkedList(){
		
		
	}
	public  LinkedList(int data){
		this.data = data;
		this.next =null;
	}
	public void setData(int data){
		this.data= data;
	}
	public int getData(){
		return data;
	}
	public void setNext(LinkedList next){
		this.next = next;
	}
	public LinkedList getNext(){
		return this.next;
	}
	public void setPrevious(LinkedList previous){
		this.previous = previous;
	}
	public LinkedList getPrevious(){
		return this.previous;
	}
	public static void main(String[] args){
		LinkedList temp=null;
		LinkedList head=new LinkedList(1);
		temp=head;
		LinkedList first=new LinkedList(2);
		head.setNext(first);
		LinkedList second=new LinkedList(3);
		first.setNext(second);
		LinkedList third=new LinkedList(4);
		second.setNext(third);
		//LinkedList fourth=new LinkedList(5);
		//third.setNext(fourth);
	//	fourth.setNext(head);
		/*LinkedList five=new LinkedList(5);
		fourth.setNext(five);
		five.setNext(third);*/
	//	cycleorNot obj=new cycleorNot();
	//	boolean isCycle = obj.cycle(head);
		//System.out.println(obj.cycle(head));
		//LinkedList startNode = obj.Start(head, isCycle);
		//System.out.println(obj.Start(head,(obj.cycle(head))).getData());
		//System.out.println(obj.loopcount(startNode));
		//LinkedList insert=new LinkedList(0);
		//nodeInsert n=new nodeInsert();
		//n.nodeInsert(head, insert);
	//	Reverse r=new Reverse();
		//temp=r.Reverse(head);
		//swapPair s=new swapPair();
		//temp=s.swapPair(head);
		/*centre c=new centre();
		System.out.println(c.centre(head).getData());
		System.out.println("_________________");
		evenOdd e=new evenOdd();
		System.out.println("************");
		System.out.println(e.evenOdd(head));
		System.out.println("************");*/
		/*int[] a={1,2,3,4,5,6,7};
		arraytoList ob=new arraytoList(a);*/
		while(temp!=null){
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
		/*System.out.println();
		nthNodefromEnd ob=new nthNodefromEnd();
		System.out.println(ob.nthNodefromEnd(head,4).getData());
		*/
	}
}

