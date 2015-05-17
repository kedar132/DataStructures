package Tree;

public class mirror {
public treeNode mirror(treeNode root){
	treeNode temp;
	if(root!=null){
		mirror(root.getleft());
		mirror(root.getright());
		temp=root.getleft();
		root.setleft(root.getright());
		root.setright(temp);
	}
	return root;
}
}
