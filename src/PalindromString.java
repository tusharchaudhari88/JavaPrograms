
public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st ="TST";
		
		String result ="";
		
		for(int i=st.length()-1;i>=0;i--) {
			
			result = result+st.charAt(i);
		}
		
		if(st.equals(result)) {
			
			System.out.println("String is Palindrom");
		}

	}

}
