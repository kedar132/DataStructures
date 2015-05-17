package LinkedList;



public class arraytoList {
	LinkedList head;
    int[] nums;
	public arraytoList(int nums[]){
		//this.nums = nums;
		head=new LinkedList(nums[0]);	
	
	
	//public LinkedList convert(){
		LinkedList temp=head;
		for(int i=1;i<nums.length;i++){
			LinkedList newnode=new LinkedList();
			newnode.setData(nums[i]);

			temp.setNext(newnode);
			temp = temp.getNext();
			
		}
		//return head;
	}

}
