package checkFrequentNumber;

class frequentNumber {
		//function for checking the frequency of a number
		//parameters: array of integers - int[] array
		//returns: int which is the most frequent in the array
		// if the array has two values which are equal in frequency, it will return the last number of highest freq
	    public int checkFrequency(int[] array) {
	        //System.out.println(array[1]);
	    	//initializing values
	        int frequency = 0;
	        int frequentNumber = 0;
	        int x, j;
	        //check for if the array is empty
	        if(array == null) {
	        	return 0;
	        }
	        else {
	        //two loops to check and compare values of the array
	        for (x = 0; x < array.length; x++) {
	            int xnumber = array[x];
	            int count = 0;
	            for (j = 0; j < array.length; j++) {

	                int jnumber = array[j];
	                //if equal number found add to count
	                if (xnumber == jnumber) {
	                    count++;
	                }
	            }
	            //if the count is higher than the previous highest frequency found, update frequency
	            if (count >= frequency) {
	                frequency = count;
	                //update frequent number when more frequent number found
	                frequentNumber = xnumber;
	            }
	        }
	        }
	        //return the most frequent number.
	        return frequentNumber;
	    }
}
