
public class ReverseSemtenceWithSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "hello Team how are you";
		
		String [] arr = st.split(" ");
		
		String result = "" ;
		
		for(int i= arr.length-1;i>=0;i--) {
			
			result = result+ arr[i]+ "  ";
		}
		System.out.println(result);
	}

}
