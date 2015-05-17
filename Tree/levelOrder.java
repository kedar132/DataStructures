package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class levelOrder {
	public void levelOrder(treeNode root){
		Queue<treeNode> Q=new LinkedList<treeNode>();
	
	Q.add(root);
	while(!Q.isEmpty()){
		treeNode temp;
		temp=Q.remove();
		System.out.println(temp.getData());
		if(temp.getleft()!=null){
			Q.add(temp.getleft());
		}
		if(temp.getright()!=null){
			Q.add(temp.getright());
		}
	}
	}
	
	public void zigZag(treeNode root){
		Queue<treeNode> Q=new LinkedList<treeNode>();
		int level=0;
	
	Q.add(root);
	Q.add(null);
	while(!Q.isEmpty()){
		treeNode temp;
		temp=Q.remove();
		if(temp==null){
			
			if(!Q.isEmpty()){
				Q.add(null);
				level=level+1;
			}
		}
		
		
		else{
			System.out.println(temp.getData());
		if(level%2==0){
		if(temp.getleft()!=null){
			Q.add(temp.getleft());
		}
		if(temp.getright()!=null){
			Q.add(temp.getright());
		}
	}
	
		 if(level%2==1){
		if(temp.getright()!=null){
			Q.add(temp.getright());
		}
		if(temp.getleft()!=null){
			Q.add(temp.getleft());
		}
	}
		}
	}
	
}
}