package telran.measure.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.measure.WeightUnit;

class WeightUnitTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void convertTest() {
		assertEquals(0.001, WeightUnit.KG.convert(WeightUnit.TN, 10), 0.01);
	}
}
