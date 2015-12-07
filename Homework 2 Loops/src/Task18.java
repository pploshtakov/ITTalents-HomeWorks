import java.util.Scanner;

public class Task18 {
	/*
	 * Задача 18: Да се състави програма, чрез която се въвежда две числа от
	 * интервала [1..9]. Програмата да извежда таблицата за умножение.
	 * Максималната стойност на множителите е определена от 2-те числа.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		do {
			System.out.println("Въведете N(1<=N<=9).");
			n = sc.nextInt();
			System.out.println("Въведете M(1<=M<=9).");
			m = sc.nextInt();
		} while (n < 1 || n > 9 || m < 1 || m > 9);
		if (n > m) {
			int x = n;
			n = m;
			m = x;
		}
		for (int i = 1; i <= n; i++) {
			for (int g = 1; g <= m; g++) {
				System.out.println(i + "*" + g + "=" + (i * g));
			}
			System.out.println();
		}
		sc.close();

		// TODO Auto-generated method stub

	}

}