package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class levelreverse {
	public void levelReverse(treeNode root){
		Queue<treeNode> Q=new LinkedList<treeNode>();
		Stack<treeNode> S=new Stack<treeNode>();
		
	
	Q.add(root);
	while(!Q.isEmpty()){
		treeNode temp;
		temp=Q.remove();
		S.push(temp);
		
		if(temp.getright()!=null){
			Q.add(temp.getright());
		}
		if(temp.getleft()!=null){
			Q.add(temp.getleft());
		}
		
	}
	while(!S.isEmpty()){
		System.out.println(S.pop().getData());
	}
	
	}



}
