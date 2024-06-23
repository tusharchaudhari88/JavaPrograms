
public class DublicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="A00BCDEFEGH H A";
		
		char [] ch = st.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			
			int count =1;
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j] &&ch[i] != ' ' ) {
					
					count++;
					//ch[j]='0';
				}
			}
			if(count >1) {
				
				System.out.println("Dublicate char is at :" + ch[i]);
				System.out.println("Index of dublicate char is " +i);
			}
		}

	}

}
