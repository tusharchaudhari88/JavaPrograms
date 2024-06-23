
public class CountCharacterNumberSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "Hi Chetan Patil 1987 How are you ?";
		char[] ch = st.toCharArray();
		
		int letter=0;
		int number =0;
		int space = 0;
		int other = 0;
		
		for(int i=0;i<ch.length;i++) {
			
			if(Character.isAlphabetic(ch[i])) {
				
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				
				number++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				
				space++;
			}
			else {
				
				other++;
			}
		}
		System.out.println("String is "+st);
		
		System.out.println("Character count is "+letter);
		System.out.println("Number count is "+number);
		System.out.println("Space count is "+space);
		System.out.println("other count is "+other);
		

	}

}
