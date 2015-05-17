package Tree;

import java.util.Stack;

public class postOrder {
	public void posOrder(treeNode root){
		Stack<treeNode> S=new Stack<treeNode>();
		while(true){
			if(root!=null){
				S.push(root);
				root=root.getleft();
			}
			if(S.isEmpty()){
				break;
			}
			else{
			if(S.peek().getright()==null){
				root=S.pop();
				System.out.println(root.getData());
				if(root==S.peek().getright()){
					
					System.out.println(S.peek().getData());
					
				}
			}
			if(!S.isEmpty())
				root=S.peek().getright();
			else
				root=null;
		}
		}	
	}
}
	
