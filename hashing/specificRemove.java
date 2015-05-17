package hashing;

public class specificRemove {
public static void main(String[] args){
	Character[] S={'a','b','c','d','e','f'};
	Character[] S1={'a','b','c','d'};
	int[] counter=new int [256];
	for(int i=0;i<counter.length;i++){
		counter[i]=0;
	}
	for(int i=0;i<S1.length;i++){
		counter[S1[i]]++;
	}
	for(int i=0;i<S.length;i++){
		if(counter[S[i]]==0){
			System.out.println(S[i]);
		}
	}
	
	
	

}
}
