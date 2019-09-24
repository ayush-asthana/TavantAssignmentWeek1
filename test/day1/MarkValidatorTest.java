package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import day1.MarkValidator;

class MarkValidatorTest {

	@Test
	void testGradefor93Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGrade(93);
		String expected="Grade A";
		assertEquals(expected, actual);
	}
	
	@Test
	void testGradefor78Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGrade(78);
		String expected="Grade B";
		assertEquals(expected, actual);
	}
	
	@Test
	void testGradefor65Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGrade(65);
		String expected="Grade C";
		assertEquals(expected, actual);
	}
	@Test
	void testGradefor37Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGrade(37);
		String expected="Fail";
		assertEquals(expected, actual);
	}
	@Test
	void testGradeforNegative50Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGrade(-50);
		String expected="Invalid Marks!";
		assertEquals(expected, actual);
	}
	
	@Test
	void testGradefor108Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGrade(108);
		String expected="Invalid Marks!";
		assertEquals(expected, actual);
	}
	@Test
	void testGradeSwitchfor93Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGradeSwitch(93);
		String expected="Grade A";
		assertEquals(expected, actual);
	}
	
	@Test
	void testGradeSwitchfor78Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGradeSwitch(78);
		String expected="Grade B";
		assertEquals(expected, actual);
	}
	
	@Test
	void testGradeSwitchfor65Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGradeSwitch(65);
		String expected="Grade C";
		assertEquals(expected, actual);
	}
	@Test
	void testGradeSwitchfor37Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGradeSwitch(37);
		String expected="Fail";
		assertEquals(expected, actual);
	}
	@Test
	void testGradeSwitchforNegative50Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGradeSwitch(-50);
		String expected="Invalid Marks!";
		assertEquals(expected, actual);
	}
	
	@Test
	void testGradeSwitchfor108Marks() {
		MarkValidator markValidator= new MarkValidator();
		String actual=markValidator.markGradeSwitch(108);
		String expected="Invalid Marks!";
		assertEquals(expected, actual);
	}

}
