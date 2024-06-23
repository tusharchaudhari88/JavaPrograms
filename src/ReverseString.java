
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "Hellow Testing";
		
		String result = "";
		
		//String [] ch  = st.split(" ");   // for "Testing Hellow " output
		
		char[] ch = st.toCharArray();     // for "gnitseT wolleH" output
		
		for(int i=ch.length-1;i>=0;i--) {
			
			result = result +ch[i];
		}
		System.out.println(result);
	}

}
