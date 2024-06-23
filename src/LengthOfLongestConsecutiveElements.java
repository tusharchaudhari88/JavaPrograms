
public class LengthOfLongestConsecutiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {20,21,30,22,50,23,50,24};
	
		int count =1;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				if(arr[j]-arr[i]==1) {
					
					count++;
				}
			}
			
		}
		System.out.println("Length Of Longest Consecutive Elements "+count);
	}

}
