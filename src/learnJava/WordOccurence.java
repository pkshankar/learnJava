package learnJava;

import java.util.HashMap;
import java.util.Map;

public class WordOccurence {

	public static void main(String[] args) {
		
		String str = "JAVA AND SELENIUM JAVA FOR SELENIUM IS JAVA";
		
		Map<String, Integer> map = countWords(str);	
		for(Map.Entry<String,Integer> m : map.entrySet()) {
			
			
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
	
	public static Map<String, Integer> countWords(String str) {
		
		Map<String, Integer> hMap = new HashMap<String,Integer>();
		int counter = 1;
		String strArr[] = str.split(" ");
		for(int i=0; i<strArr.length; i++) {
			
			if(!hMap.containsKey(strArr[i])) {
				
				hMap.put(strArr[i], counter);
			}
			
			else {
				
				hMap.put(strArr[i], hMap.get(strArr[i])+1);
			}
		}
		
		return hMap;
		
	}

}
