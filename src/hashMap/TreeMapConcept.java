package hashMap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		TreeMap<String, String> empData=new TreeMap<String, String>(Collections.reverseOrder());
		// TODO Auto-generated method stub
		//TreeMap<String, String> empData=new TreeMap<String, String>();
		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put("Amit", "SDET5");
		empData.put("arpit", "SDET6");
		empData.put("1", "SDET7");
		empData.put("$", "SDET8");
		
		empData.remove("Naveen");
		empData.remove("Lisa", "SDET4");
		boolean flag=empData.containsKey("Naveen");
		System.out.println(flag);
		System.out.println(empData);
		
		for(Map.Entry<String, String> entry: empData.entrySet()) {
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}
		System.out.println("-------");
		empData.forEach((k,v) -> System.out.println(k+":"+v));
	}

}
