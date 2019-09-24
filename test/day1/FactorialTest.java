package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import day1.Factorial;

class FactorialTest {

	@Test
	void testFactoialFor5() {
		Factorial factorial= new Factorial();
		int expected=factorial.factorial(5);
		int actual=120;
		assertEquals(expected, actual);
	}
	@Test
	void testFactoialFor4() {
		Factorial factorial= new Factorial();
		int expected=factorial.factorial(4);
		int actual=24;
		assertEquals(expected, actual);
	}
	@Test
	void testFactoialForNegative4() {
		Factorial factorial= new Factorial();
		int expected=factorial.factorial(-4);
		int actual= 0;
		assertEquals(expected, actual);
	}
	
	

}
