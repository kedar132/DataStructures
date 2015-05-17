package Tree;

public class isStructural {
	public boolean isStructural(treeNode root,treeNode root1){
		//if(root==null && root1==null){
		//	return true;
		//}
		if(root.getData()==root1.getData()){
			return true;
		}
		if(root==null || root1==null){
			return false;
		}
		
		if((isStructural(root.getleft(),root1.getleft())) && (isStructural(root.getright(),root1.getright()))){
		return false;
		}
		return true;
	}

}
