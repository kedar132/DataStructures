package Tree;

import java.util.Stack;

public class inOrder {
public void inOrder(treeNode root){
	Stack<treeNode> S=new Stack<treeNode>();
	while(true){
		while(root!=null){
			S.push(root);
			root=root.getleft();
		}
		if(S.isEmpty()){
			break;
		}
		root=S.pop();
		System.out.println(root.getData());
		root=root.getright();
	}
	
}
}
