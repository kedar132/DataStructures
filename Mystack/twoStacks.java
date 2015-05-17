package Mystack;

public class twoStacks {
int[] stack=new int[32];
int fcount=-1;
int scount=31;

public void push(int data,int id){
	if(id==1 && fcount<stack.length/2){
		stack[++fcount]=data;
		
	}
	else if(fcount==stack.length/2){
		System.out.println("1st Full");
	}
	if(id==2 && scount>stack.length/2){
		stack[--scount]=data;
	}
	
}
public int pop(int id){
	if(id==1 && fcount!=-1){
		int temp=stack[fcount--];
		
		return temp;
	}
	else if(id==1 &&fcount==-1){
		System.out.println("1st stack is empty");
	}
	//return 0;
	if(id==2 && scount!=31){
int temp=stack[scount++];
		
		return temp;
	
		
	}
	else if(scount==31 && id==2){
		System.out.println("2st stack is empty");
	}
	return 0;
}
public static void main(String[] args){
	twoStacks ob=new twoStacks();
	ob.push(2,1);
	ob.push(4,2);
	ob.push(8,2);
	System.out.println(ob.pop(1));
	System.out.println(ob.pop(2));
	System.out.println(ob.pop(1));
	System.out.println(ob.pop(2));
}

}
