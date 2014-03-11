public class NumberCube {

	/*
	 * @return an integer value between 1 and 6
	 */
	public int toss() {
		return ((int) (Math.random()*6) +1);
	}
	
	/**
	 * Returns an array of the values obtained by tossing a number
	 * cube numTosses times
	 * @param cube a NumberCube
	 * @param numTosses the number of tosses to be recorded
	 * @return an array of numTosses values
	 */
	public static int[] getCubeTosses(NumberCube cube, int numTosses){
		//TODO Fill me out
	}
	
	/**
	 * Returns the starting index of the longest run of two or more
	 * consecutive repeated values in the array 'values'
	 * @param values an array of integer values representing rolls
	 * @return the index of the starting index of longest run or
	 * -1 if there is no run
	 */
	public static int getLongestRun(int[] values){
		//TODO Fill me out
	}
	
	public static void main(String[] args){
		// Suggestion: insert a breakpoint for each of these lines and verify in debug mode
		int[] someArray = getCubeTosses(new NumberCube(), 50);
		int longestRunIndex = getLongestRun(someArray);
	}
}
