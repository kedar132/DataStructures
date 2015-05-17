package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class width {
	public int width(treeNode root){
		treeNode temp;
		Queue<treeNode> Q=new LinkedList<treeNode>();
		int count=0;
		int max=0;
		if(root!=null){
			max=1;
		}
		else{
			return -1;
		}
		Q.add(root);
		Q.add(null);
		while(!Q.isEmpty()){
			temp=Q.remove();
			if(temp==null){
				if(max<count){
					max=count;
					
				}
				count=0;
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
			count++;
		}
		return max-1;
	}

}
