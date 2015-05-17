package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class noofleaf {
	public int numberofLeaf(treeNode root){
		Queue<treeNode> Q=new LinkedList<treeNode>();
		int count=0;
		Q.add(root);
		while(!Q.isEmpty()){
			treeNode temp;
			temp=Q.remove();
			//System.out.println(temp.getData());
			if(temp.getleft()!=null){
				Q.add(temp.getleft());
			}
			if(temp.getright()!=null){
				Q.add(temp.getright());
			}
			if(temp.getleft()!=null && temp.getright()==null || temp.getleft()==null && temp.getright()!=null){
				count++;
				
			}
		}
		return count;
}
}
