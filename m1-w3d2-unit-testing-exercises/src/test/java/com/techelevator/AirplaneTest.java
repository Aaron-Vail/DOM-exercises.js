package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest { 
	
	Airplane sut;
	
	@Before
	public void setUp() throws Exception {
		
		sut = new Airplane("123456", 17, 42);
	}

	@Test
	public void testConstructor() {
		assertEquals("123456", sut.getPlaneNumber());
		assertEquals(17, sut.getTotalFirstClassSeats());
		assertEquals(42, sut.getTotalCoachSeats());
	}
	@Test
	public void testAccurateCountFirstClass() {
		
		assertEquals(17, sut.getAvailableFirstClassSeats()); //tests constructor
		sut.reserveSeats(true, 16);
		assertEquals(1, sut.getAvailableFirstClassSeats()); // tests one less than total number of first class seats.
		sut.reserveSeats(true, 1);
		assertEquals(0, sut.getAvailableFirstClassSeats()); // tests last available first class seat.
		sut.reserveSeats(true, 1);
		assertEquals(0, sut.getAvailableFirstClassSeats()); // tests overbook.
		assertEquals(false, sut.reserveSeats(true, 1));

	}
	@Test
	public void testAccurateCountCoach() {
		
		assertEquals(42, sut.getAvailableCoachSeats());
		sut.reserveSeats(false, 41);
		assertEquals(1, sut.getAvailableCoachSeats());
		sut.reserveSeats(false, 41);
		assertEquals(1, sut.getAvailableCoachSeats()); 
		sut.reserveSeats(false, 1);
		assertEquals(0, sut.getAvailableCoachSeats()); 
		assertEquals(false, sut.reserveSeats(false, 1));
	}	

}
