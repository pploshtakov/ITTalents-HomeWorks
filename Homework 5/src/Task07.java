import java.util.Scanner;

public class Task07 {
	/*
	 * Задача 7: Да се състави програма, която чете набор от думи разделени с
	 * интервал. Като резултат да се извеждат броя на въведените думи, както и
	 * броя знаци в най-дългата дума.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете набор от думи разделени с интервали.");
		String words = sc.nextLine();
		System.out.println("Въведени думи:" + words);
		System.out.println(countWords(words) + " думи, най-дългата е с " + countLettersLongestWord(words) + " символа.");
		sc.close();
		// TODO Auto-generated method stub

	}

	static int countWords(String words) {
		int count = 1;
		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == ' ' && words.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count;
	}

	static int countLettersLongestWord(String words) {
		int letters = 0;
		String[] words1 = words.split(" ");
		for (int i = 0; i < words1.length; i++) {
			if (words1[i].length() > letters) {
				letters = words1[i].length();
			}
		}
		return letters;
	}
}
