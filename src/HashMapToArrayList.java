import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("Tushar", 1);
		map.put("Chaudhari", 2);
		
		
		//finding set of Keys from HashSet
		Set<String> keySet = map.keySet();
		
		//Creating arrayList of Keys passing the keySet	
		ArrayList<String> keyList = new ArrayList<String>(keySet);
		
		//collecting Values from HashMap	
		Collection<Integer> value = map.values();
		
		//Creating ArrayList of Vlaues
		ArrayList<Integer> valueList = new ArrayList<Integer>(value);
		
		System.out.println("Keys of map are "+keyList);
		System.out.println("Values of map are "+valueList);
		

	}

}
