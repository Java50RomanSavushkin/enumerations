package telran.time.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.time.DayOfWeek;

class DayOfWeekTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		assertEquals(0, getOrdinalDayOfWeek(DayOfWeek.MON));
		assertEquals("MON", getNameDayOfWeek(DayOfWeek.MON));
	}

	private int getOrdinalDayOfWeek(DayOfWeek day) {
		return day.ordinal();
	}

	private String getNameDayOfWeek(DayOfWeek day) {
		return day.name();
	}
	
	

	
	
	
	
	
	
	
}
