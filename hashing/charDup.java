package hashing;

public class charDup {
	public char[] removeDup(char[] str){
	int[] counter=new int[256];
	int count=0;
	char[] s=new char[32];
	for(int i=0;i<counter.length;i++){
		counter[i]=0;
	}
	for(int i=0;i<str.length;i++){
		if(counter[str[i]]==1){
			continue;
		}
		else{
			s[count]=str[i];
			count++;
			counter[str[i]]=1;
			
		}
	}
	return s;
	}
	public static void main(String[] args){
		char[] S={'a','b','c','a','d','c','e'};
		charDup c=new charDup();
		System.out.print(c.removeDup(S));
	}
}
