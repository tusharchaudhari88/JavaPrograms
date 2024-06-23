
public class SmallestAndSecondSmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {12,13,1,10,34,1};
		
		int smallest = arr[0];
		int secondSmallest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]< smallest) {
				
				smallest = arr[i];
			}
		}
		System.out.println("smallest element is " +smallest);
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] < secondSmallest && arr[i] >smallest ) {
				
				secondSmallest =arr[i];
			}		
		}
		System.out.println("secondSmallest element is " +secondSmallest);
	}

}
