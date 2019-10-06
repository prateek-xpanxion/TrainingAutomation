package SampleMaven.SampleMaven;


//Program to count vowels, consonants, digits and spaces

public class CountVowelAndConsonant {

	public static void main(String[] args) {

		String str = "I love Java";
		int vowels = 0;
		int consonants = 0;
		int digits = 0;
		int spaces = 0;

		str = str.toLowerCase();
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			} else if (ch >= 'a' && ch <= 'z') {
				++consonants;
			} else if (ch >= '0' && ch <= '9') {
				++digits;
			} else if (ch == ' ') {
				++spaces;
			}
			System.out.println("Vowels: " + vowels);
			System.out.println("Consonants: " + consonants);
			System.out.println("Digits: " + digits);
			System.out.println("Spaces: " + spaces);
		}

	}

}
