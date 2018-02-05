import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P1_testcase {

	@Test
	void testpass1() {
		int resulttrue1 = Problem1.multiply(2,6);
		assertEquals(12, resulttrue1);
	}
	@Test
	void testpass2() {
		String resulttrue2 = Problem1.concatinate("base", "ball");
		assertEquals("baseball", resulttrue2);
		
	}
	@Test
	void testfail1() {
		int resultfalse1 = Problem1.multiply(2, 3);
		assertEquals(7, resultfalse1);
	}
	@Test
	void testfail2() {
		String resultfalse2 = Problem1.concatinate("fish", "tank");
		assertEquals("firework", resultfalse2);
	}

}
