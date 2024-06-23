import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequestCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "success";
		
		String[] ch = st.split("");

		HashMap<Object,Integer> map = new HashMap<Object,Integer>();
		
		for(int i=0;i<ch.length;i++) {
			
			if(map.containsKey(ch[i])) {
				
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i],1);
			}
		}
		
		System.out.println(map);
		
		String key ="";
		int value = 0;
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MAX_VALUE;
		
		for(Map.Entry<Object,Integer> element : map.entrySet()) {
			
			key =(String)element.getKey();
			value = (Integer)element.getValue();
			
			if(value > firstMax) {
				
				secondMax =firstMax;
				firstMax = value;
			}
			else if(value > secondMax && value < firstMax) {
				
				secondMax = value;
			}
		}
		
	for(Map.Entry<Object,Integer> element : map.entrySet()) {
			
			key =(String) element.getKey();
			value = (Integer)element.getValue();
			
			if(value ==secondMax ) {
				
				System.out.println(key +" "+value);
			}
		}
		
	}

}
