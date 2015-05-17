package Tree;

public class LCA {
	public int LCA(treeNode root,int d1,int d2){
		int max;
		int min;
		if(d1>d2){
			max=d1;
		min=d2;}
			else{
				max=d2;
				min=d1;
			}
		while(true){
			if(root.getData()>min && root.getData()<max){
				return root.getData();
			}
			else{
			if(root.getData()>max){
				root=root.getleft();
			}
			else if (root.getData()<max){
				root=root.getright();
			}
			}
		}
		
	}

}
