package journal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DogTest {
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
	    public void testSetNameAndGetBreed() {
	        String expectedName = "Max";
	        String expectedBreed = "Labrador";
	        Dog dog = new Dog("", ""); // Creating a dog instance with empty strings
	        dog.setName(expectedName);
	        dog.setBreed(expectedBreed);
	        assertEquals(expectedName, dog.getName());
	        assertEquals(expectedBreed, dog.getBreed());
	    }
}
