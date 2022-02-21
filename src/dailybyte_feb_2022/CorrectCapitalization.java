package dailybyte_feb_2022;

/*
 * 
This question is asked by Google. Given a string, return whether or not it uses capitalization correctly. 
A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, 
or only the first letter is capitalized.

Ex: Given the following strings...

"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
 *  
 *  */
public class CorrectCapitalization {

	public static void main(String[] args) {
		System.out.println(correctCapitalization("USA"));
		System.out.println(correctCapitalization("Calvin"));
		System.out.println(correctCapitalization("compUter"));
		System.out.println(correctCapitalization("coding"));
	}

	private static boolean correctCapitalization(String word) {
		char firstCharacter = word.charAt(0);
		// checking condition for all lowercase
		if (isLower(firstCharacter)) {
			int i = 1;
			while (i < word.length()) {
				if (isLower(word.charAt(i))) {
					i++;
					continue;
				} else {
					return false;
				}
			}

			return i == word.length();
		} else {
			// checking for first upper character
			int i = 1;

			// checking condition for all caps
			while (i < word.length() && isUpper(word.charAt(i))) {
				i++;
			}

			if (i == word.length()) {
				return true;
			} else if (i > 1) {
				return false;
			}

			// checking condition for subequent alphabets in lowercase
			while (i < word.length() && isLower(word.charAt(i))) {
				i++;
			}

			return i == word.length();
		}
	}

	static boolean isLower(char c) {
		return c >= 'a' && c <= 'z';
	}

	static boolean isUpper(char c) {
		return c >= 'A' && c <= 'Z';
	}

}
