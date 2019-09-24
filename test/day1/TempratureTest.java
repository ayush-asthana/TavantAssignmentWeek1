package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempratureTest {

	@Test
	void testConvert10degreeCelcuisToFarenheit() {
		Temprature temprature=new Temprature();
		double actual=temprature.convertToFarenheit(10.0);
		double expected=50.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvert50degreeCelcuisToFarenheit() {
		Temprature temprature=new Temprature();
		double actual=temprature.convertToFarenheit(50.0);
		double expected=122.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvert104degreeFarenhiteToCelsius() {
		Temprature temprature=new Temprature();
		double actual=temprature.convertToCelsius(104.0);
		double expected=40.0;
		assertEquals(expected, actual);
	}
	
	@Test
	void testConvert215_6degreeFarenhiteToCelsius() {
		Temprature temprature=new Temprature();
		double actual=temprature.convertToCelsius(215.6);
		
		double expected=102.0;
		assertEquals(expected, actual);
	}

}
