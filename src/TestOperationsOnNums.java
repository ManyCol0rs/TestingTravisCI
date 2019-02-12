import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestOperationsOnNums {

	OperationsOnNums o = new OperationsOnNums(8,4);
	@Test
	void testAdd() {
		assertEquals(o.add(), 12);
	}
	@Test
	void testSubtract() {
		assertEquals(o.subtract(), 0);
	}
	@Test
	void testMultiply() {
		assertEquals(o.multiply(), 32);
	}
	@Test
	void testDivide() {
		assertEquals(o.divide(), 4);
	}

}
