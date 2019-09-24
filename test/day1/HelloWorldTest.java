package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class HelloWorldTest {

	@Test
	void test() {
		HelloWorld helloworld = new HelloWorld(); 
		String actual = helloworld.getMessage();
		String expected="Hello world";
		assertEquals(actual,expected);
	}

}
