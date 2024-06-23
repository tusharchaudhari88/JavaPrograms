import java.util.HashMap;
import java.util.Map;

public class mergeArrays {
	
	static void mergeArray(int[] a,int[] b, int length1,int length2) {
		
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		
		for(int i=0;i<length1;i++) {
			
			map.put(a[i],true);
		}
		
		for(int j=0;j<length2;j++) {
			
			map.put(b[j],true);
		}
		
		for(Map.Entry<Integer,Boolean> m :map.entrySet()) {
			
			System.out.print(m.getKey()+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,5,6};
		int[] b= {2,4,7,8};
		
		int length1 = a.length;
		int length2 = b.length;
		
		mergeArray(a,b,length1,length2);

	}

}
