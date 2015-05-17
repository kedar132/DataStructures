package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class height {
	public int height(treeNode root){
		Queue<treeNode> Q=new LinkedList<treeNode>();
	int level=0;
	Q.add(root);
	Q.add(null);
	treeNode temp;
	while(!Q.isEmpty()){
		
		temp=Q.remove();
		if(temp==null){
			if(!Q.isEmpty()){
			
			Q.add(null);
			}
			level=level+1;
			//continue;
		
		}
		else{
		if(temp.getleft()!=null){
			Q.add(temp.getleft());
		}
		if(temp.getright()!=null){
			Q.add(temp.getright());
		}
		}
		
	}
	return level;
	}
}
