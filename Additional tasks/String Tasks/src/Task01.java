import java.util.Scanner;

public class Task01 {
	/*
	 * 1. Напишете програма, която проверява дали даден символен низ е префикс
	 * (начало) на друг символен низ.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете низ от символи.");
		String some = sc.nextLine();
		String some1 = new String();
		do {
			System.out.println("Въведете нов низ (по - кратък от предишния).");
			some1 = sc.nextLine();
		} while (some.length() < some1.length());
		boolean prefix = true;
		for (int i = 0; i < some1.length(); i++) {
			if (some.charAt(i) != some1.charAt(i)) {
				prefix = false;
				break;
			}
		}
		if (prefix == true) {
			System.out.println("Втория низ е префикс на първия.");
		} else {
			System.out.println("Втория низ не е префикс на първия.");
		}
		sc.close();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
