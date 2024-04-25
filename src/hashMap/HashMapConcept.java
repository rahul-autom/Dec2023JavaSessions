package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//k,v
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		empMap.put("Tom", 101);
		empMap.put("lisa", 200);
		System.out.println(empMap.size());
		System.out.println(empMap.get("Tom"));
		empMap.put("lisa", 300);
		System.out.println(empMap.get("lisa"));
		HashMap<String, String> empData=new HashMap<String, String>();
		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put(null, "SDET Manager");
		empData.put(null, "SDET Director"); 
		
		System.out.println(empData.get(null));
		System.out.println(empData.get("Naveen"));
		
		System.out.println(empData);
		
		for(Map.Entry<String, String> entry:empData.entrySet()) {
			System.out.println(entry.getKey() + ":"+entry.getValue());
		}
		
		
		
		System.out.println("-----------");
		
		//foreach methods
		empData.forEach((i,j) -> System.out.println(i+":"+j));
		
		
		
	}

}
