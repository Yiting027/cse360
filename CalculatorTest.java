package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator cal = new Calculator();
		assertNotNull(cal);
	}

	@Test
	public void testGetTotal() {
		Calculator cal = new Calculator();
		assertEquals(0,cal.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		cal.add(3);
		assertEquals(3,cal.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator cal = new Calculator();
		cal.add(4);
		cal.subtract(2);
		assertEquals(2,cal.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator cal = new Calculator();
		cal.add(3);
		cal.multiply(4);
		assertEquals(12,cal.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator cal = new Calculator();
		cal.add(6);
		cal.divide(2);
		assertEquals(3,cal.getTotal());
		cal.divide(0);
		assertEquals(0,cal.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator cal = new Calculator();
		cal.add(6);
		cal.divide(2);
		cal.subtract(1);
		cal.multiply(4);
		assertEquals("0 + 6 / 2 - 1 * 4",cal.getHistory());
		cal.divide(0);
		assertEquals("0 + 6 / 2 - 1 * 4 / 0",cal.getHistory());
	}

}
