package arrays;

public class StrUtils {

	// int --> R�ckgabewert
	int countChars(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (Character.isLetter(s.charAt(i))){
			count++;
			}
		}

		return count;
	}
}
