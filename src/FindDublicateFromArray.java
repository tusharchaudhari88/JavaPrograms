
public class FindDublicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,5,3,2,6,4,1,5};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println("Dublicate number in array is "+arr[i]);
				}
			}
		}
		
		String [] arr1 = {"abc","cde","abc","ght","cde"};
		
		for(int i=0;i<arr1.length;i++) {
			
			for(int j=i+1;j<arr1.length;j++) {
				
				if(arr1[i].equals(arr1[j])) {
					
					System.out.println("Dublicate String in array is "+arr1[i]);
				}
			}
		}
		
		String s = "Welcome";
		
		String[] st = s.split("");
		
		for(int i=0;i<st.length;i++) {
			
			for(int j=i+1;j<st.length;j++) {
				
				if(st[i].equals(st[j])) {
					
					System.out.println("Dublicate String in array is "+st[i]);
				}
			}
		}
	}

}
