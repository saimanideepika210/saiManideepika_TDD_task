package com.epam.TDDtask;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class RemoveATest {
	

	RemoveACharacters removeAChar;

	
	@BeforeEach
	void setUp() {
	removeAChar = new RemoveACharacters();
		
	}

	@Test
	void testAtFirstIndex() {
			assertEquals("BCD",removeAChar.remove("ABCD"));
	}
	
	
	@Test
	void testAtTwoIndexes() {
			assertEquals("CD",removeAChar.remove("AACD"));
	}
	
	@Test
	void testAtSecondIndex() {
		assertEquals("BCD",removeAChar.remove("BACD"));
	}
	
	@Test
	void testForNoA() {
		assertEquals("BBAA",removeAChar.remove("BBAA"));
	}
	
	@Test
	void testForNChars() {
		assertEquals("BBA",removeAChar.remove("AABBA"));
	}
	

}


