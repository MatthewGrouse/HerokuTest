package reverseString;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.junit.Test;

public class reverseStringTest {

	@Test
	public void testIterativeReverse() {
		reverseString string = new reverseString();
		String nullString = null;
		String result = string.iterativeReverse(nullString);
		assertNull("Checking checkFrequency for null array",result);
		String test = "Hello 2";
		result = string.iterativeReverse(test);
		assertEquals("Checking checkFrequency for null array", "2 olleH",
				result);
		test = "Hello World";
		result = string.iterativeReverse(test);
		assertEquals("Checking checkFrequency for null array", "dlroW olleH",
				result);
		
	}
	@Test
	public void testRecursiveReverse() {
		reverseString string = new reverseString();
		String nullString = null;
		String result = string.recursiveReverse(nullString);
		assertNull("Checking checkFrequency for null array",result);
		String test = "Hello 2";
		result = string.recursiveReverse(test);
		assertEquals("Checking checkFrequency for null array", "2 olleH",
				result);
		test = "Hello World";
		result = string.recursiveReverse(test);
		assertEquals("Checking checkFrequency for null array", "dlroW olleH",
				result);
	}

}
