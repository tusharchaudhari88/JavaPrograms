import java.util.HashMap;
import java.util.Map;

public class CountEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "Hi Tushar Chaudhari Pass";
		
		//int[] ch = {10,20,30,20,10,40};
		
		HashMap<Object,Integer> map = new HashMap<Object,Integer>();
		
		char[] ch = st.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(map.containsKey(ch[i])) {
				
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				
				map.put(ch[i], 1);
			}
		}
		for(Map.Entry<Object,Integer> mp1 :map.entrySet()) {
			
			System.out.println(mp1.getKey()+" "+mp1.getValue());
		}

	}

}
