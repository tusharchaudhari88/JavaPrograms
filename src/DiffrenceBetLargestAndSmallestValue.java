
public class DiffrenceBetLargestAndSmallestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {5,7,2,4};
		
		int max= arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
			}
		}
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]<min) {
				
				min = arr[j];
			}
		}
		System.out.println("Max Value is "+max);
		System.out.println("Min Value is "+min);
		
		System.out.println("Diffrence bet Largest and Smallest value is "+(max-min));
		
	}

}
