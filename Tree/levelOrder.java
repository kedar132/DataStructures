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