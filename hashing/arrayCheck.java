package hashing;

public class arrayCheck {
public boolean check(int[] A,int[] B){
	int[] array=new int[256];
	for(int i=0;i<array.length;i++){
		array[i]=0;
	}
	for(int i=0;i<A.length;i++){
		array[A[i]]++;
	}
	for(int i=0;i<B.length;i++){
		array[B[i]]--;
	}
	for(int i=0;i<array.length;i++){
		if(array[i]==1){
			return false;
		}
	}
	return true;
	
}
public static void main(String [] args){
	int[] A={1,6,3,3,11,7,1};
	int[] B={6,3,1,11,1,3,3};
	arrayCheck n=new arrayCheck();
	System.out.println(n.check(A, B));
}
}
