package checkFrequentNumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class frequentNumberTest {

	@Test
	public void testCheckFreqeuncy() {
		new frequentNumber();
		frequentNumber frequentNo = new frequentNumber();
		//test for null array
		int[] nullArray = null;
		int result = frequentNo.checkFrequency(nullArray);
		assertEquals("Checking checkFrequency for null array", "0",
				Integer.toString(result));
		int[] testArray1 = {1,2,2,5,2,3,4,5};
		result = frequentNo.checkFrequency(testArray1);
		assertEquals("Checking checkFrequency for array", "2",
				Integer.toString(result));
		int[] testArray2 = {2,2,2,2,2,2,2,2};
		result = frequentNo.checkFrequency(testArray2);
		assertEquals("Checking checkFrequency for array of same number", "2",
				Integer.toString(result));
		int[] testArray3 = {-1,2,4,-1,6,9,-1};
		result = frequentNo.checkFrequency(testArray3);
		assertEquals("Checking checkFrequency for array with negative numbers", "-1",
				Integer.toString(result));
		int[] testArray4 = {-2,4,-1,2,5,6,2,5,2,2,8,9,5,5,10,2};
		result = frequentNo.checkFrequency(testArray4);
		assertEquals("Checking checkFrequency for larger array", "2",
				Integer.toString(result));
		int[] equalFreqArray = {2,2,2,2,4,4,4,4,8,8,8,8};
		result = frequentNo.checkFrequency(equalFreqArray);
		//have not yet implemented process to deal with equal frequency in the array
		assertEquals("Checking checkFrequency for array", "8",
				Integer.toString(result));
	}

}
