import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sorting without inbuild function
		
		int temp=0;
		int[] arr = {20,10,30,60,40,70,50,90,80,100};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
