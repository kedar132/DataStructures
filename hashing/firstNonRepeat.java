package hashing;

public class firstNonRepeat {
public Character findnon(Character[] c){
	int[] counter =new int[256];
	for(int i=0;i<counter.length;i++){
		counter[i]=0;
	}
	for(int i=0;i<c.length;i++){
		counter[c[i]]++;
	}
	for(int i=0;i<c.length;i++){
		if(counter[c[i]]==1){
			return c[i];
		}
	}
	return ',';
}
public static void main(String [] args){
	Character[] c={'a','b','c','z','a','b','c'};
	firstNonRepeat n=new firstNonRepeat();
	System.out.println(n.findnon(c));
}
}
