package Tree;

import java.util.Stack;

public class preOrder {
	public void preOrder(treeNode root){
		Stack<treeNode> S=new Stack<treeNode>();
		while(true){
			while(root!=null){
				S.push(root);
				System.out.println(root.getData());
				root=root.getleft();
				
			}
			if(S.isEmpty()){
				break;
			}
			root=S.pop();
			root=root.getright();
			
		}
	}

}
