package com.sapient.numbers;

public class FigureToWords {

	private static long number;

	static String baseOne[] = { "", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ",
			"ten ",
			"eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ",
			"nineteen " };

	static String baseTen[] = { "", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ",
			"ninety " };

	public FigureToWords(long figure) {
		FigureToWords.number = figure;
	}

	public static String numToWords(int n, String s) {
		String str = "";
		if (n > 19) {
			str += baseTen[n / 10] + baseOne[n % 10];
		} else {
			str += baseOne[n];
		}

		if (n != 0) {
			str += s;
		}

		return str;
	}

	public static String fig_to_words() {
		String out = "";
		out += numToWords((int) (number / 10000000), "crore ");
		out += numToWords((int) ((number / 100000) % 100), "lakh ");
		out += numToWords((int) ((number / 1000) % 100), "thousand ");
		out += numToWords((int) ((number / 100) % 10), "hundred ");
		if (number > 100 && number % 100 > 0) {
			out += "and ";
		}

		// handles digits at ones and tens places (if any)
		out += numToWords((int) (number % 100), "");

		return out;
	}

}
