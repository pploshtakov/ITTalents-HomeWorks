import java.util.Scanner;

public class Task03 {
	/*
	 * Задача 3: Да се състави програма, чрез която се въвеждат последователно
	 * две редици от символи без интервали. Програмата да извежда съобщение за
	 * резултата от сравнението им по позиции.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низ от символи(без разтояния).");
		String word = sc.nextLine();
		validString(word, sc);
		System.out.println("Въведете 2-ри низ от символи(без разтояния).");
		String word1 = sc.nextLine();
		validString(word1, sc);
		if (word.length() == word1.length()) {
			System.out.println("Двата низа са с еднаква дължина.");
			compareSymbol(word, word1);
		} else if (word.length() > word1.length()) {
			System.out.println(word + " е с повече символи.");
			compareSymbol(word1, word);
		} else {
			System.out.println(word1 + " е с повече символи.");
			compareSymbol(word, word1);
		}

		// TODO Auto-generated method stub
		sc.close();
	}

	static void compareSymbol(String word, String word1) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != word1.charAt(i)) {
				System.out.println((i + 1) + " " + word.charAt(i) + "-" + word1.charAt(i));
			}
		}
		if (word.length() < word1.length()) {
			for (int i = word.length(); i < word1.length(); i++) {
				System.out.println((i + 1) + " " + "none - " + word1.charAt(i));
			}
		}
	}

	static String validString(String word, Scanner sc) {
		while (word.contains(" ")) {
			System.out.println("Повторете низа без разтояния!");
			word = sc.nextLine();
		}
		return word;

	}
}