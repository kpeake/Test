package Package1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgebraTest {

	@Test
	public void test() {
		
		Algebra algebra = new Algebra();
		
		assertEquals("2 + 4 must equal 6", 6, algebra.addMeUp(2,  4));
		//assertEquals("2 + 4 must equal 6", 5, algebra.addMeUp(2,  4));
		
		//fail("Not yet implemented");
	}

}
