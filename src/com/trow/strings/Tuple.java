package com.trow.strings;

public class Tuple {
	
	private String word;
	private int length;
	
	Tuple(String word, int length) {
		this.word = word;
		this.length = length;
	}

	public String getWord() {
		return word;
	}

	public int getLength() {
		return length;
	}
} 