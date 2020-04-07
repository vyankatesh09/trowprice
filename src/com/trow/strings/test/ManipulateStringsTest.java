package com.trow.strings.test;

import com.trow.strings.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.trow.strings.ManipulateStrings;
import com.trow.strings.Tuple;

import junit.framework.Assert;

class ManipulateStringsTest {

	@Test
	void findLongestWordTest() {
		String test = "This is a valid pointer.";
		ManipulateStrings manipulateStrings = new ManipulateStrings();
		Tuple tuple = manipulateStrings.findLongestWord(test);
        assertEquals("pointer", tuple.getWord());
        assertEquals(7, tuple.getLength());
	}
	
	@Test
	void findLongestWordErrorTest() {
		String test = "";
		ManipulateStrings manipulateStrings = new ManipulateStrings();
		Tuple tuple = manipulateStrings.findLongestWord(test);
        assertEquals(null, tuple);
	}
	
	@Test
	void findShortestWordTest() {
		String test = "This is a valid pointer.";
		ManipulateStrings manipulateStrings = new ManipulateStrings();
		Tuple tuple = manipulateStrings.findShortestWord(test);
        assertEquals("a", tuple.getWord());
        assertEquals(1, tuple.getLength());
	}
	
	@Test
	void findShortestWordErrorTest() {
		String test = "";
		ManipulateStrings manipulateStrings = new ManipulateStrings();
		Tuple tuple = manipulateStrings.findShortestWord(test);
        assertEquals(null, tuple);
	}

}
