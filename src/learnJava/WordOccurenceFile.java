// C:\\Users\\P K Shankar\\Documents\InputFile.txt

package learnJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordOccurenceFile {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\P K Shankar\\Documents\\InputFile.txt");
		
		Map<String, Integer> map = countWordsFile(file);
		
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
	
	public static Map<String, Integer> countWordsFile(File file) {
		
		Scanner sc = null;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		try {
			
			sc = new Scanner(file);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		while(sc.hasNext()) {
			
			String word = sc.next();
			if(!map.containsKey(word)) {
				
				map.put(word, 1);
			}
			
			else {
				
				map.put(word, map.get(word)+1);
			}
		}
		
		return map;
	}

}
