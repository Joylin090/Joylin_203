package journal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class personTest {
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
	    public void testGetterMethodsWithDifferentData() {
	        String expectedName = "Noela";
	        int expectedAge = 21;
	        Person person = new Person(expectedName, expectedAge);
	        assertEquals(expectedName, person.getName());
	        assertEquals(expectedAge, person.getAge());
	    }
	
}
