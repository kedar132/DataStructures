package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class maxLevel {
	public int maxLevel(treeNode root){
		treeNode temp;
		int count=0;
		int maxsum=0;
		int maxlevel=0;
		int level=0;
		Queue<treeNode> Q=new LinkedList<treeNode>();
		
	
		
		Q.add(root);
		Q.add(null);
		while(!Q.isEmpty()){
			temp=Q.remove();
			if(temp==null){
				if(maxsum<count){
					maxsum=count;
					maxlevel=level;
					
				}
				count=0;
				if(!Q.isEmpty()){
				Q.add(null);
				level++;
				
			}
				}
			else{
				if(temp.getleft()!=null){
					Q.add(temp.getleft());
				}
				if(temp.getright()!=null){
					Q.add(temp.getright());
				}
				count=count+temp.getData();
			}
			
		}
		return maxlevel;
	}

}
