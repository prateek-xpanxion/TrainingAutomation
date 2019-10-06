package SampleMaven.SampleMaven;

import java.util.Arrays;

/*Logic for Anagram
 * 1. Take 2 strings as I/P
 * 2. Covert them to Char Array
 * 3. Sort two char array using Arrays.sort() method
 * 4. compare two sort array
 * 
 * If sentence is given then follow below steps
 * 
 * 1. Take 2 strings as I/P
 * 2. Remove spaces
 * 3. Convert them into lower/upper case
 * 4. Covert them to Char Array
 * 5. Sort two char array using Arrays.sort() method
 * 6. compare two sort array
 */

public class AnagramCheck {

	public static void main(String[] args) {

		// String str1 = "Java";
		// String str2 = "avaj";

		String str1 = "I like Java";
		String str2 = "java i Like";

		char[] charArrayFromString1 = str1.toLowerCase().toCharArray();
		char[] charArrayFromString2 = str2.toLowerCase().toCharArray();

		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);

		boolean result = Arrays.equals(charArrayFromString1, charArrayFromString2);

		if (result == true) {
			System.out.println("Two strings are anagram");
		} else {
			System.out.println("Two strings are not anagram");
		}

	}

}
