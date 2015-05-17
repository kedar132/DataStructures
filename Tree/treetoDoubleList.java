package Tree;

import LinkedList.LinkedList;
import java.util.Stack;

public class treetoDoubleList {
	
	
	public LinkedList treetoDoubleList(treeNode root){
		
		LinkedList temp = new LinkedList();
		LinkedList head = new LinkedList();
		LinkedList prev=new LinkedList();
		head = temp;
		int count=0;
		
			Stack<treeNode> S=new Stack<treeNode>();
			while(true){
				while(root!=null){
					S.push(root);
					root=root.getleft();
				}
				if(S.isEmpty()){
					temp = null;
					prev.setNext(head);
					head.setPrevious(prev);
					return head;
					
				}
				
				root=S.pop();
				 temp.setData(root.getData());
				LinkedList n=new LinkedList();
				 temp.setNext(n);
				 n.setPrevious(temp);

				 prev=temp;
				 temp=n;
				
				
				
				//System.out.println(root.getData());
				root=root.getright();
			
				
		}
			
	}

}
