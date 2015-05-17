package Tree;
import LinkedList.LinkedList;
public class treeNode {
int data;
treeNode left;
treeNode right;
public treeNode(int data){
	this.data=data;
}
public int getData(){
	return data;
}
public int setData(int data){
	this.data=data;
	return data;
}
public treeNode getleft(){
	return left;
}
public void setleft(treeNode left){
this.left=left;
}
public treeNode getright(){
	return right;
}
public void setright(treeNode right){
	this.right=right;
			
}

public static void main(String []args){
	treeNode ob=new treeNode(6);
	//treeNode obj=new treeNode(1);
	treeNode root=ob;
	//treeNode root1=obj;
	ob.setleft(new treeNode(3));
	ob.setright(new treeNode(8));
	ob.left.setleft(new treeNode(2));
	ob.left.setright(new treeNode(5));
	//ob.left.left.setleft(new treeNode(2));
	//ob.left.left.setright(new treeNode(1));
	//ob.left.setright(new treeNode(4));
	//ob.left.right.setright(new treeNode(5));
	//ob.right.setright(new treeNode(7));
	//ob.right.left.setright(new treeNode(8));
	//ob.right.left.setleft(new treeNode(9));
	//ob.left.left.setright(new treeNode(10));
	//ob.left.left.setleft(new treeNode(12));
	//ob.left.right.setright(new treeNode(13));

	//ob.left.right.setleft(new treeNode(11));
	
	
	//obj.setleft(new treeNode(2));
	//obj.setright(new treeNode(3));
	//obj.left.setleft(new treeNode(4));
	/*obj.left.setright(new treeNode(5));
	obj.right.setleft(new treeNode(6));
	obj.right.setright(new treeNode(7));
	//obj.right.left.setright(new treeNode(8));*/
	levelOrder l=new levelOrder();
	l.levelOrder(root);
	
	//treetoDoubleList p=new treetoDoubleList();
	//LinkedList lp = p.treetoDoubleList(root);
	//LinkedList head = lp;
//	while(lp.getNext()!=head){
	//	System.out.println (lp.getData());
		//lp=lp.getNext();
	//}
	
	//mirror m=new mirror();
	//treeNode M=m.mirror(root);
	//p.levelOrder(M);
	
	
}


}
