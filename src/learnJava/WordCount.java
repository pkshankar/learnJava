// JAVA AND SELENIUM JAVA FOR SELENIUM IS JAVA

package learnJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {

	public static void main(String[] args) {

		String str = "JAVA AND SELENIUM JAVA FOR SELENIUM IS JAVA";
		File file = new File("C:\\Users\\P K Shankar\\Documents\\InputFile.txt");
		TreeMap<String, Integer> wordCountStringMap = countOccurence(str);
		TreeMap<String, Integer> wordCountFileMap = countOccurence(file);
		System.out.println("WORD COUNT - INPUT STRING");
		for (Map.Entry<String, Integer> stringMap : wordCountStringMap.entrySet()) {

			System.out.println(stringMap.getKey() + " : " + stringMap.getValue());
		}

		System.out.println("********************************************");

		System.out.println("WORD COUNT - INPUT FILE");

		for (Map.Entry<String, Integer> fileMap : wordCountFileMap.entrySet()) {

			System.out.println(fileMap.getKey() + " : " + fileMap.getValue());
		}

	}

	public static TreeMap<String, Integer> countOccurence(String inputString) {

		TreeMap<String, Integer> wordStringMap = new TreeMap<String, Integer>();
		String[] strArr = inputString.split(" ");
		for (int counter = 0; counter < strArr.length; counter++) {

			if (!wordStringMap.containsKey(strArr[counter])) {

				wordStringMap.put(strArr[counter], 1);
			}

			else {

				wordStringMap.put(strArr[counter], wordStringMap.get(strArr[counter]) + 1);
			}

		}

		return wordStringMap;
	}

	public static TreeMap<String, Integer> countOccurence(File inputFileScanner) {

		Scanner scanner = null;
		TreeMap<String, Integer> wordFileMap = new TreeMap<String, Integer>();
		try {

			scanner = new Scanner(inputFileScanner);
			while (scanner.hasNext()) {

				String word = scanner.next();
				if (!wordFileMap.containsKey(word)) {

					wordFileMap.put(word, 1);
				}

				else {

					wordFileMap.put(word, wordFileMap.get(word) + 1);
				}
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return wordFileMap;
	}

}
