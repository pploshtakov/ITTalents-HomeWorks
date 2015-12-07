import java.util.Scanner;

public class Task08 {
	/*
	 * Задача 8: Да се състави програма, чрез която се въвежда ред от символи
	 * (стринг, низ). Програмата да изведе на екрана дали въведения стринг е
	 * палиндром, т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дума.");
		String word = sc.nextLine();
		System.out.println("Въведена дума: " + word);
		chekPalindrome(word);
		sc.close();
		// TODO Auto-generated method stub

	}

	static void chekPalindrome(String word) {
		char[] chars = word.toCharArray();
		for (int i = 0; i < chars.length / 2; i++) {
			char x = chars[i];
			chars[i] = chars[chars.length - (i + 1)];
			chars[chars.length - (i + 1)] = x;
		}
		String reverseWord = new String(chars);
		if (word.equalsIgnoreCase(reverseWord)) {
			System.out.println("Въведената дума е палиндром.");
		} else {
			System.out.println("Въведената дума не е палиндром.");
		}
	}
}