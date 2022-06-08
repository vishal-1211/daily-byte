package dailybyte_feb_2022;

/*
 * 
This question is asked by Apple. Given two binary strings (strings containing only 1s and 0s) 
return their sum (also as a binary string).
Note: neither binary string will contain leading 0s unless the string itself is 0

Ex: Given the following binary strings...

"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return  "1"

 *  */

public class AddBinary {

	public static void main(String[] args) {
		String str1 = "100";
		String str2 = "1";

		System.out.println(addStrings(str1, str2));

		str1 = "1101";
		str2 = "100";

		System.out.println(addStrings(str1, str2));

		str1 = "10101";
		str2 = "10001";

		System.out.println(addStrings(str1, str2));

	}

	private static String addStrings(String str1, String str2) {
		String finalOutcome = "";

		// digit sum
		int digit = 0;

		int i = str1.length() - 1;
		int j = str2.length() - 1;

		while (i >= 0 || j >= 0 || digit == 1) {
			digit += i >= 0 ? str1.charAt(i) - '0' : 0;
			digit += j >= 0 ? str2.charAt(j) - '0' : 0;

			finalOutcome = (char) (digit % 2 + '0') + finalOutcome;

			digit /= 2;

			i--;
			j--;
		}

		return finalOutcome;
	}

}
