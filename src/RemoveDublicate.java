import java.util.Arrays;
import java.util.HashSet;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,2,6,2,7,4,8,9,2};
		
		//String st1 = "ABCDAB";
		//String [] arr = st1.split("");
		
		HashSet<Object> st = new HashSet<Object>();
		
		for(int i=0;i<arr.length;i++) {
			
			st.add(arr[i]);
		}
		System.out.println(st);
		
	}

}
