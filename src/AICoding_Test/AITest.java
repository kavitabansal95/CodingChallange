package AICoding_Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AITest {

	public static void main(String[] args) throws IOException {
		
			File file = new File("/Users/kbansal/Downloads/1.txt"); 
		    BufferedReader br = new BufferedReader(new FileReader(file)); 
		    String st; 
		    while ((st = br.readLine()) != null) {
			String[] words = st.split("\\s"); 
	        String[] uniqueWords; 
	        int count = 0; 
	        uniqueWords=uniquewords(words);
	        for (String word: words ) {
				if (null==word) {
					break;
				}
			for (String s:words) {
				if(word.equals(s)) {
					count++;
				}
			}
	        System.out.println("count of ["+word+"] is  " + count);
	        
	        }
				
				
				
			}}
	


public static String[] uniquewords(String[] words) {
	String[] uniqueWord = new String[words.length];
	
	uniqueWord[0] = words[0];
	int uniquewordIndex= 1;
	boolean wordExist = false;
	for (int i = 1; i < words.length; i++) {
		for (int j = 0; j <=uniqueWord.length; j++) {
			if (words[i].equals(uniqueWord[i])) {
				wordExist=true;
			}
			
		}
	if (!wordExist) {
		uniqueWord[uniquewordIndex]= words[i];
		uniquewordIndex++;
	}
	wordExist=false;
	}
	return uniqueWord;
	
	
}











}
	
		


	


