package com.trow.strings;

public class ManipulateStrings implements ManipulateStringsInterface {
	
	public static boolean isAValidCharacter(char c) {
		return (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z'));
	}
	
	public Tuple findLongestWord(String str) {
		
		if(str==null || str.length() == 0)
		{
			System.out.println("Null/Empty String");
			return null;
		}
		
		String words[] = str.split(" ");
		int maxLength = 0;
		String currWord, longestWord = null;
		
		for(int i=0; i<words.length; i++) {
			currWord = words[i];
			if(!isAValidCharacter(currWord.charAt(currWord.length()-1)))
				currWord = currWord.substring(0, currWord.length()-1);
			
			if(currWord.length() > maxLength)
			{
				maxLength = currWord.length();
				longestWord = currWord;
			}
		}
		
		Tuple result = new Tuple(longestWord, maxLength);
		return result;
	}
	
	public Tuple findShortestWord(String str) {
		
		if(str==null || str.length() == 0)
			{
				System.out.println("Null/Empty String");
				return null;
			}
		
		String words[] = str.split(" ");
		int minLength = Integer.MAX_VALUE;
		String currWord, longestWord = null;
		
		for(int i=0; i<words.length; i++) {
			currWord = words[i];
			if(!isAValidCharacter(currWord.charAt(currWord.length()-1)))
				currWord = currWord.substring(0, currWord.length()-1);
			
			if(currWord.length() < minLength)
			{
				minLength = currWord.length();
				longestWord = currWord;
			}
		}
		
		Tuple result = new Tuple(longestWord, minLength);
		return result;
	}

}
