
public class LargestCharSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "Java123Program456TusharChaudhari1988";
		
		char[] ch = st.toCharArray();
		
		String temp = "";
		String max_String ="";
		
		for(int i=0;i<ch.length;i++) {
			
			if(Character.isAlphabetic(ch[i])) {
				
				temp = temp+ch[i];
			}
			else if(temp.length() > max_String.length()) {
				
				max_String = temp;
				temp="";
			}
		}
		System.out.println("Max String is  "+max_String);
	}

}
