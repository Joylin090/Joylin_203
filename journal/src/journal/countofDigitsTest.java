package journal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class countofDigitsTest {
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
    public void testCountDigitsPositiveNumber() {
        int num = 91203;
        int expectedResult = 5;
        int actualResult = countofDigits.countDigits(num);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountDigitsNegativeNumber() {
        int num = -12345;
        int expectedResult = 5;
        int actualResult = countofDigits.countDigits(num);
        assertEquals(expectedResult, actualResult);
    }
}
