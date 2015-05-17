package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class structural {
	public boolean structural(treeNode root,treeNode root1){
		boolean Struct=false;
		Queue<treeNode> Q=new LinkedList<treeNode>();
		Queue<treeNode> Q1=new LinkedList<treeNode>();
		Q.add(root);
		Q1.add(root1);
		Q.add(null);
		Q1.add(null);
		treeNode temp,temp1;
		while(!Q.isEmpty() || !Q1.isEmpty()){
			if(Q.isEmpty() && Q1.isEmpty()){
				Struct =true;
			}
			if(Q.isEmpty() && !Q1.isEmpty() || !Q.isEmpty() && Q1.isEmpty()){
				return Struct= false;
			}
			temp=Q.remove();
			temp1=Q1.remove();
			
			if(temp!=null && temp1!=null){
				Struct=true;
			}
			else if(temp1==null && temp==null){
				Struct=true;
			}
			else if(temp1==null && temp!=null || temp==null && temp1!=null ){
				return Struct=false; 
			}
			
			if(temp==null){
				if(!Q.isEmpty()){
				
				Q.add(null);
				}
			
			}
			
			else{
			 if(temp.getleft()!=null){
					Q.add(temp.getleft());
				}
				if(temp.getright()!=null){
					Q.add(temp.getright());
				}
			}
			if(temp1==null){
				if(!Q.isEmpty()){
				
				Q1.add(null);
				}
			
			}
			else{
			 if(temp1.getleft()!=null){
					Q1.add(temp1.getleft());
				}
				if(temp1.getright()!=null){
					Q1.add(temp1.getright());
				}
			}
			
		}
		return Struct;
	}
}
