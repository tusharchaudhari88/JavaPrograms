import java.util.Arrays;

public class ShiftPositiveNegetiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,-2,4,-4,6,5,-6};
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i] > 0) {
					
					temp =arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
