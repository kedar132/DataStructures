package Tree;

public class minPath {
	public void minPath(treeNode root,int data){
		while(root.getData()!=data){
			if(root.getData()>data){
				System.out.println(root.getData());
				root=root.getleft();
			}
			if(root.getData()<data){
				System.out.println(root.getData());
				root=root.getright();
			}
		}
		System.out.println(root.getData());
	}

}
