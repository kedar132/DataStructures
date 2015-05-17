package searching;

public class missingElement {
	public static void main(String[] args){
		int [] A={1,5,2,3,6,7,4};
		int n=A.length;
		int[] B=new int[n+2];
		for(int i=0;i<n;i++){
			B[A[i]]=A[i];
		}
		for(int i=0;i<n+2;i++){
			int j=i+1;
			if(B[j]==0){
				System.out.println(B[i]+1);
				break;
			}
		}
	}

}
