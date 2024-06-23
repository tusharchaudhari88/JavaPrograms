import java.util.Arrays;

public class Sum2ElementfromArrayEualToGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,4,5,6};
		int k=6;
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j= i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j] == k) {
					count++;
					System.out.println("Numbers are "+arr[i] +" And " +arr[j] +
							" and Index is "+i  +" and " +j);
				}
			}
			
			}
		System.out.println(count);
		
	}
}
