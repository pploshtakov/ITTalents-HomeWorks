import java.util.Scanner;

public class Task02 {
	/*
	 * Задача 2: Да се състави програма, чрез която от клавиатурата се въвеждат
	 * последователно две думи с дължина 10-20 знака. Програмата да размени
	 * първите им 5 знака и да изведе дължината на по-дългата, както и новото им
	 * съдържание.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дума (10..20 символа.)");
		String word = sc.nextLine();
		validWord(word, sc);
		System.out.println("Въведете 2ра дума (10..20 символа.)");
		String word1 = sc.nextLine();
		validWord(word1, sc);
		System.out.println("Въведени думи: " + word + "," + word1);
		if (word.length() > word1.length()) {
			System.out.println("По-дълга дума -" + word.length() + " букви:" + word);
		} else if (word.length() == word1.length()) {
			System.out.println("Думите са с равен брой букви - " + word.length());
		} else {
			System.out.println("По-дълга дума -" + word1.length() + " букви:" + word1);
		}
		String wordNew = word.substring(0, 5) + word1.substring(5);
		String word1New = word.substring(5) + word1.substring(0, 5);
		System.out.println("Новообразувани думи: " + wordNew + "," + word1New);
		// TODO Auto-generated method stub
		sc.close();
	}

	static String validWord(String word, Scanner sc) {
		while (word.length() < 10 || word.length() > 20) {
			System.out.println("Повторете думата (10..20 символа!)");
			word = sc.nextLine();
		}
		return word;
	}
}
