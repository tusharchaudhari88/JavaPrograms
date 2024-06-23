
public class FirstNonReapeatingCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "gibblegabbleriya";
		
		char[] ch = st.toCharArray();
		
		for(int i=0;i<ch.length;i++) {		
		int	count=0;
			for(int j=0;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
					count++;
					
				}
			}
			if(count == 1) {
				
				System.out.println("first non- reapting char is " +ch[i]);
				break;
			}
		}
	}

}
