import java.util.Scanner;

public class Task17 {
	/*
	 * Задача 17: Да се състави програма, която извежда квадрат, чийто страни са
	 * оформени със знака *, а вътрешността е запълнена със въведен знак. Входни
	 * данни b - дължина на страната число от интервала [3..20], c - желан знак.
	 * Програмата да използва цикъл for.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b;
		do {
			System.out.println("Въведете N(N>1).");
			b = sc.nextInt();
		} while (b <= 1);
		System.out.println("Въведете символ.");
		char s = sc.next().charAt(0);
		for (int i = 1; i <= b; i++) {
			if (i == 1 || i == b) {
				for (int g = 1; g <= b; g++) {
					System.out.print("*");
				}
			} else {
				for (int k = 1; k <= b; k++) {
					if (k == 1 || k == b) {
						System.out.print("*");
					} else {
						System.out.print(s);
					}
				}
			}
			System.out.println();
			sc.close();
		}
		// TODO Auto-generated method stub

	}

}
