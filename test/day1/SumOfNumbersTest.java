package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import day1.SumOfNumbers;

class SumOfNumbersTest {

	@Test
	void testSumOfEvenNumbersBetween1to10() {
		SumOfNumbers sumOfNumbers= new SumOfNumbers();
		int actual=sumOfNumbers.sumOfEvenNumbers(1,10);
		int expected=30;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfEvenNumbersBetween11to20() {
		SumOfNumbers sumOfNumbers= new SumOfNumbers();
		int actual=sumOfNumbers.sumOfEvenNumbers(11,20);
		int expected=80;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfEvenNumbersBetween12to19() {
		SumOfNumbers sumOfNumbers= new SumOfNumbers();
		int actual=sumOfNumbers.sumOfEvenNumbers(12,19);
		int expected=60;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfOddNumbersBetween1to10() {
		SumOfNumbers sumOfNumbers= new SumOfNumbers();
		int actual=sumOfNumbers.sumOfOddNumbers(1,10);
		int expected=25;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfOddNumbersBetween11to20() {
		SumOfNumbers sumOfNumbers= new SumOfNumbers();
		int actual=sumOfNumbers.sumOfOddNumbers(11,20);
		int expected=75;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfOddNumbersBetween12to19() {
		SumOfNumbers sumOfNumbers= new SumOfNumbers();
		int actual=sumOfNumbers.sumOfOddNumbers(12,19);
		int expected=64;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfOddNumbersBetweenMinus10toMinus20() {
		SumOfNumbers sumOfNumbers= new SumOfNumbers();
		int actual=sumOfNumbers.sumOfOddNumbers(-10,-20);
		int expected=0;
		assertEquals(expected, actual);
	}
}
