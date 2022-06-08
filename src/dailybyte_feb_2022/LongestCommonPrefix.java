package dailybyte_feb_2022;

import java.util.Arrays;

public class LongestCommonPrefix {

	/*
	 * This question is asked by Microsoft. Given an array of strings, return the
	 * longest common prefix that is shared amongst all strings. Note: you may
	 * assume all strings only contain lowercase alphabetical characters.
	 * 
	 * Ex: Given the following arrays...
	 * 
	 * ["colorado", "color", "cold"], return "col" ["a", "b", "c"], return ""
	 * ["spot", "spotty", "spotted"], return "spot"
	 * 
	 */

	public static void main(String[] args) {
		String[] inputArray = { "colorado", "color", "cold" };
		System.out.println(sortArrayBySorting(inputArray));
	}

	private static String sortArrayBySorting(String[] inputArray) {
		String finalOutcome = "";
		int size = inputArray.length;

		if (size == 0) {
			return finalOutcome;
		}

		if (size == 1) {
			return inputArray[0];
		}

		Arrays.sort(inputArray);

		int end = Math.min(inputArray[0].length(), inputArray[size - 1].length());

		int start = 0;
		while (start < end && inputArray[0].charAt(start) == inputArray[size - 1].charAt(start)) {
			start++;
		}

		finalOutcome = inputArray[0].substring(0, start);
		return finalOutcome;

	}

}
