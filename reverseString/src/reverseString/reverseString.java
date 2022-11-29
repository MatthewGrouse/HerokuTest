package reverseString;

public class reverseString {
	//function to iteratively reverse a string
	//parameters: String test -  the string to be reversed
	//returns:String reversed - a reversed string
	public String iterativeReverse(String test) {
		String reversed;
		//check if the string is null
		if(test == null) {
			return null;
		}
		else {
		//convert string to array of letters
		char[] letters = test.toCharArray();
		int len = letters.length;
		char temp;
		int x;
		int y = len - 1;
		//loop through the values starting on both sides of the word and swap them
		for(x=0; x<y; x++,y--) {
			temp = letters[x];
			letters[x] = letters[y];
			letters[y] = temp;
		}
		//convert letters back to word
		reversed = new String(letters);
		}
		return reversed;
	}
	//function to recursively reverse a string
	//parameters: String test -  the string to be reversed
	public String recursiveReverse(String test) {
		//check if string is null
		if(test == null) {
			return null;
		}
		String reversed = null;
		char[] letters = test.toCharArray();
		int index = 0;
		//pass to recursive function to reverse the letters
		reverse(letters, index);
		//convert back into a string
		reversed = new String(letters);
		
		return reversed;
	}
	//the recursive function to reverse the string i.e swaps all the letters
	public void reverse(char[] letters, int index) {
		int len = letters.length;
		//check if every letter has been swapped i.e the index should be equal
		if(index == len/2) {
			return;
		}
		char temp = letters[index];
		letters[index] = letters[len - index -1];
		letters[len - index - 1] = temp;
		//recursive call
		reverse(letters, index+1);
	}
}
