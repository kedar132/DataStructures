package Tree;

public class isBST {
	public boolean isBST(treeNode root){
		if(root==null)
			return true;
		if(root.getleft()!=null && root.left.getData()>root.getData())
			return false;
		if(root.getright()!=null && root.right.getData()<root.getData())
			return false;
		if(!isBST(root.getleft())|| !isBST(root.getright()))
			return false;
		return true;
	}
	

}
