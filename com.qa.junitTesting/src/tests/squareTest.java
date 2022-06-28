package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void testSquare() {
		UnitTesting obj = new UnitTesting();

		int a = obj.square(4);

		assertEquals(16, a);
	}

	@Test
	public void testSum() {
		UnitTesting sum = new UnitTesting();

		int b = sum.sum(4, 5);

		assertEquals(9, b);
	}

	@Test
	public void testSumNotEqual() {
		UnitTesting sum = new UnitTesting();

		int b = sum.sum(4, 5);

		assertNotEquals(19, b);
	}
}
