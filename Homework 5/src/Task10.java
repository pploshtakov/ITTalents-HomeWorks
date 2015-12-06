import java.util.Scanner;

public class Task10 {
	/*
	 * Задача 10: Да се състави програма, която по даден низ връща друг,
	 * символите, на който са получени като към всеки код на символ от ASCII
	 * таблицата е добавеното числото 5 и е записан новополучения символ.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низ от символи.");
		String symbols = sc.nextLine();
		String newSymbols = replaceSymbols(symbols);
		System.out.println("Въведен низ: " + symbols);
		System.out.println("Нов низ(ACII + 5): " + newSymbols);
		sc.close();
		// TODO Auto-generated method stub

	}

	static String replaceSymbols(String s) {
		char[] symbol = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			symbol[i] = (char) ((int) (symbol[i] + 5));
		}
		s = new String(symbol);
		return s;
	}
}
