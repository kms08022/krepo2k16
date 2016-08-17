package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testMultiply() {
		Junit Test = new Junit();
int result = Test.multiply(3, 4);
	assertEquals(12, result);
	}

}
