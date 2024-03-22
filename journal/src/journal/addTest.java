package journal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class addTest {
	//Joylin D'Cunha RollNo: 203

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
		@Test
	    public void testAddition() {
	        int first = 5;
	        int second = 4;
	        int expectedResult = 9;
	        int actualResult = first + second;
	        assertEquals(expectedResult, actualResult);
	    }

	    @Test
	    public void testNegativeNumbers() {
	        int first = -2;
	        int second = -7;
	        int expectedResult = -9;
	        int actualResult = first + second;
	        assertEquals(expectedResult, actualResult);
	    }

}
